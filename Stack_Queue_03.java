import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> q=new LinkedList<>();
        ArrayList<Integer> arr=new ArrayList<>();
        
        for(int i=0; i<progresses.length; i++){
            int x=100-progresses[i];
            int nx=0;
        
            if(x%speeds[i]==0) q.add(x/speeds[i]);
            else q.add(x/speeds[i]+1);
        }
        
        while(!q.isEmpty()){
            int cur=q.poll();
            int cnt=1;
            
            while(!q.isEmpty() && q.peek() <= cur){
                q.poll();
                cnt++;
            }
            
            arr.add(cnt);
            
        }
        
        int[] answer = new int[arr.size()];
        for(int i=0; i<arr.size(); i++) answer[i]=arr.get(i);
        
        return answer;
    }
}
