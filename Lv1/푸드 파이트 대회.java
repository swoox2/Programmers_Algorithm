class Solution {
    public String solution(int[] food) {
        String answer = "";
        
        for(int i=1; i<food.length; i++){
            int f=food[i];
            
            if(f%2!=0) f-=1;
            
            f/=2;
            
            for(int j=0; j<f; j++) answer+=String.valueOf(i);
            
        }
        
        answer+="0";
        
        for(int i=answer.length()-2; i>=0; i--) answer+=answer.substring(i,i+1);
        
        return answer;
    }
}
