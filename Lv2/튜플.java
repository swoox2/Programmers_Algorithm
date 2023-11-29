import java.util.*;
class Solution {
    public int[] solution(String s) {
        
        HashMap<String, Integer> map=new HashMap<>();
        
        s=s.substring(2);
        s=s.substring(0,s.length()-2);
        
        s=s.replace("},{", ",");
        
        String[] str=s.split(",");
        
        for(int i=0; i<str.length; i++) map.put(str[i], map.getOrDefault(str[i], 0)+1);
        
        int[] answer=new int[map.size()];
        
        int len=map.size();
        for(int i=0; i<map.size(); i++){
            
            for(String key : map.keySet()){
                if(map.get(key)==len){
                    answer[i]=Integer.parseInt(key);
                    break;
                }
            }
            len--;
        }
      
        return answer;
    }
}
