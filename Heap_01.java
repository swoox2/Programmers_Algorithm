import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        
        for(int i=0; i<scoville.length; i++) pq.add(scoville[i]);
        
        int cnt=0;
        while(true){
            
            if(pq.peek() >= K) break;
                
            if(pq.size()==1) return -1;
            
            int first=pq.poll();
            int second=pq.poll();
            
            int new_s=first+second*2;
            
            pq.add(new_s);
            cnt++;

        }
        return cnt;
    }
    
}
