class Solution {
    int solution(int[][] land) {
        int[][] dp=new int[land.length][land[0].length];
        
        for(int i=0; i<4; i++) dp[0][i]=land[0][i];
        
        for(int row=1; row<land.length; row++){
            for(int i=0; i<4; i++){
                for(int j=0; j<4; j++){
                    if(i!=j){
                        dp[row][i]=Math.max(dp[row][i], land[row][i]+dp[row-1][j]);
                    
                    }
                }
            }
        }
        
        int max=0;
        for(int i=0; i<4; i++){
            max=Math.max(max, dp[land.length-1][i]);
        }
        
        return max;
    }
}
