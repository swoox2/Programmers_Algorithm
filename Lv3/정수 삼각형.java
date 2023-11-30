import java.util.*;
class Solution {
    public int solution(int[][] triangle) {
        int[][] dp=new int[triangle.length][triangle.length];
        
        dp[0][0]=triangle[0][0];
        
        for(int i=0; i<triangle.length-1; i++){ //행
            for(int j=0; j<=i; j++){ //열
                
                dp[i+1][j]=Math.max(dp[i+1][j], dp[i][j]+triangle[i+1][j]);
                dp[i+1][j+1]=Math.max(dp[i+1][j+1], dp[i][j]+triangle[i+1][j+1]);
                
            }
        }
        
        int max=0;
        for(int i=0; i<dp.length; i++){
            max=Math.max(max, dp[dp.length-1][i]);
        }
        
        return max;
    }
}
