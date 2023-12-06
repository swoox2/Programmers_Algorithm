import java.util.*;
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int cnt = 0;
        
        Queue<Integer> q=new LinkedList<>();
        
        int sum=0;
        for(int i=0; i<truck_weights.length; i++){
            int truck=truck_weights[i];
            
            while(true){
                if(q.isEmpty()){
                    q.add(truck);
                    cnt++;
                    sum+=truck;
                    break;
                }else if(q.size()==bridge_length){
                    sum-=q.poll();
                }else{
                    if(sum+truck > weight){
                        q.add(0);
                        cnt++;
                    }else{
                        q.add(truck);
                        cnt++;
                        sum+=truck;
                        break;
                    }
                }
            }
        }
        
        return cnt+bridge_length;
    }
}
