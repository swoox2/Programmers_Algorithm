import java.util.*;
class Solution {
    public int solution(int[] queue1, int[] queue2) {
        
        Queue<Integer> q1=new LinkedList<>();
        Queue<Integer> q2=new LinkedList<>();
        long q1_sum=0;
        long q2_sum=0;
        
        for(int i=0; i<queue1.length; i++){
            q1.add(queue1[i]);
            q2.add(queue2[i]);
            q1_sum+=queue1[i];
            q2_sum+=queue2[i];
        }
        
        int cnt=0;
        while(q1_sum!=q2_sum){
            if(cnt > (q1.size()+q2.size())*2) return -1;
            
            if(q1_sum > q2_sum){
                int x=q1.poll();
                q2.add(x);
                q1_sum-=x;
                q2_sum+=x;
            }else if(q1_sum < q2_sum){
                int x=q2.poll();
                q1.add(x);
                q1_sum+=x;
                q2_sum-=x;
            }
            
            cnt++;
        }
        
        return cnt;
    }
}
