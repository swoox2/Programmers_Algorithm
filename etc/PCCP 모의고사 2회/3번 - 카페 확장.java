import java.util.*;
class Solution {
    public int solution(int[] menu, int[] order, int k) {
        int answer = 0;
        
        int index=0;
        int waiting=0;
        int[] endtime=new int[order.length];
        
        for(int i=0; i<order.length; i++){
            while(index < i && endtime[index] <= k*i){
                index++;
                waiting--;
            }
            
            
            waiting++;
            
            if(i==0) endtime[i]=menu[order[0]];
            else endtime[i]=Math.max(endtime[i-1], i*k)+menu[order[i]];
            
            answer=Math.max(answer, waiting);
        }
        
        return answer;
    }
}
