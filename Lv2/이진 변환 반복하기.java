class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        String one="";
        int zero_cnt=0;
        int total_cnt=0;
        
        
        while(!s.equals("1")){
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i)=='1'){
                one+=1;
            }else zero_cnt++;
        }
        
        int len=one.length();
        s="";
        one="";
            
        while(len!=0){
            s+=String.valueOf(len%2);
            len/=2;
        }
            total_cnt++;
        }
        
        answer[0]=total_cnt;
        answer[1]=zero_cnt;
        
        return answer;
    }
}
