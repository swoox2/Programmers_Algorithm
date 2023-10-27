class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int s=brown+yellow;
        
        for(int i=1; i<=s; i++){
            int width=0, height=0;
            if(s%i==0){
                width=s/i;
                height=i;
            }else continue;
            
            if(width < height) continue;
            
            if((width-2)*(height-2)==yellow){
                answer[0]=width;
                answer[1]=height;
            }
        }
        
        
        return answer;
    }
}
