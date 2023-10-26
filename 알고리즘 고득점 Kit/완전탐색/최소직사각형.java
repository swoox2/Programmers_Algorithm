import java.util.*;
class Solution {
    public int solution(int[][] sizes) {
        int max_w=0,max_h=0;
        for(int i=0; i<sizes.length; i++){
            int weight=Math.max(sizes[i][0], sizes[i][1]);
            int height=Math.min(sizes[i][0], sizes[i][1]);
            
            max_w=Math.max(max_w, weight);
            max_h=Math.max(max_h, height);            
        }
        
        return max_w*max_h;
    }
}
