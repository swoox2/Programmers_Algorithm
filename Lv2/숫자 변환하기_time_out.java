import java.util.*;
class Solution {
    public int solution(int x, int y, int n) {
        int answer = 0;
        Queue<Integer> q=new LinkedList<>();
        q.add(x);
        
        while(!q.isEmpty()){
            int size=q.size();
            
            for(int i=0; i<size; i++){
                int cur=q.poll();
                
                if(cur==y) return answer;
                
                if(cur+n<=y) q.add(cur+n);
                if(cur*2<=y) q.add(cur*2);
                if(cur*3<=y) q.add(cur*3);
            }
            answer++;
        }
        return -1;
    }
}
