import java.util.*;
class Solution {
    public int solution(int[] citations) {
        int n=citations.length;
        
        int h=0;
        int max=0;
        while(h<=n){
            boolean[] check=new boolean[n];
            
            for(int i=0; i<n; i++){
                if(citations[i]>=h) check[i]=true;
            }
            
            int cnt_t=0;
            for(int i=0; i<n; i++){
                if(check[i]) cnt_t++;
            }
            
            if(cnt_t>=h) max=Math.max(max,h);
            
            h++;
        }
        
        return max;
    }
}
