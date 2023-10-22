import java.util.*;
class Node{
    int idx, prior;
    
    Node(int idx, int prior){
        this.idx=idx;
        this.prior=prior;
    }
    
}

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<Node> q=new LinkedList<>();
        
        for(int i=0; i<priorities.length; i++) q.add(new Node(i,priorities[i]));
        
        while(!q.isEmpty()){
            Node cur=q.poll();
            
            boolean isAdd=false;
            for(Node next : q){
                if(next.prior > cur.prior){
                    q.add(new Node(cur.idx, cur.prior));
                    isAdd=true;
                    break;
                }
            }
            if(isAdd) continue;
            else{
                answer++;
                if(cur.idx==location) break;
            }
        }
        return answer;
    }
}
