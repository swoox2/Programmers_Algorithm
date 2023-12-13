import java.util.*;
class Solution {
    public long[] solution(int[][] program) {
        long[] answer = new long[11];
        
        Arrays.sort(program, (o1, o2) -> {
            return o1[1]-o2[1];
        });
        
        PriorityQueue<int[]> pq=new PriorityQueue<>((o1, o2) -> {
            if(o1[0]==o2[0]) return o1[1]-o2[1];
            return o1[0]-o2[0];
        });
        
        long time=0;
        for(int i=0; i<program.length; i++){
            int[] p=program[i];
            if(p[1] <= time){
                pq.add(p);
                continue;
            }else i--;
            
            if(pq.isEmpty()){
                time=p[1];
                continue;
            }
            
            int[] now=pq.poll();
            answer[now[0]]+=(time-now[1]);
            
            time+=now[2];
            
        }
        
        while(!pq.isEmpty()){
            int[] now=pq.poll();
            answer[now[0]]+=(time-now[1]);
            time+=now[2];
        }
        answer[0]=time;
    
        return answer;
    }
}
