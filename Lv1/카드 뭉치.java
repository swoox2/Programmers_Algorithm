import java.util.*;
class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        
        Queue<String> q1=new LinkedList<>();
        Queue<String> q2=new LinkedList<>();
        
        Collections.addAll(q1, cards1);
        Collections.addAll(q2, cards2);
        
        int cnt=0;
        for(int i=0; i<goal.length; i++){
            String g=goal[i];
            
            if(!q1.isEmpty() && q1.peek().equals(g)){
                q1.poll();
                cnt++;
            }
            if(!q2.isEmpty() && q2.peek().equals(g)){
                q2.poll();
                cnt++;
            }
            
        }
        
        return cnt==goal.length ? "Yes" : "No";
    }
}
