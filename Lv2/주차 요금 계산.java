import java.util.*;
class Solution {
    TreeMap<Integer, Integer> map=new TreeMap<>();
    
    public int totalMin(String time1, String time2){
        int hour=Integer.parseInt(time2.substring(0,2))-Integer.parseInt(time1.substring(0,2));
        int min=Integer.parseInt(time2.substring(3,5))-Integer.parseInt(time1.substring(3,5));
    
        return hour*60+min;
    }
    
    public void totalAmount(int[] answer, int[] fees){
        int idx=0;
        for(int key : map.keySet()){
            if(fees[0]>=map.get(key)){
                answer[idx++]=fees[1];
            }else{
                int ceil=(int)Math.ceil((double)(map.get(key)-fees[0])/fees[2]);
                answer[idx++]=fees[1]+ceil*fees[3];
            }
        }
    }
    
    public int[] solution(int[] fees, String[] records) {
        
        for(int i=0; i<records.length; i++){
            String[] str1=records[i].split(" ");
            
            String time1=str1[0];
            String num1=str1[1];
            String in_out1=str1[2];
            
            boolean isExist=false;
            if(i!=records.length-1 && in_out1.equals("IN")){
                for(int j=i+1; j<records.length; j++){
                    String[] str2=records[j].split(" ");
                    
                    String time2=str2[0];
                    String num2=str2[1];
                    String in_out2=str2[2];
                    
                    if(num1.equals(num2)){
                        isExist=true;
                        map.put(Integer.parseInt(num1),map.getOrDefault(Integer.parseInt(num1),0)+totalMin(time1,time2));
                        break;
                    }
                }
                if(!isExist){
                    map.put(Integer.parseInt(num1),map.getOrDefault(Integer.parseInt(num1),0)+totalMin(time1, "23:59"));
                }
            }else if(i==records.length-1 && in_out1.equals("IN")){
                map.put(Integer.parseInt(num1),map.getOrDefault(Integer.parseInt(num1),0)+totalMin(time1, "23:59"));
            }
            
        }
        
        int[] answer=new int[map.size()];

        totalAmount(answer, fees);
        
        return answer;
    }
}
