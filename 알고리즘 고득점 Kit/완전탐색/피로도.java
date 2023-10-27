class Solution {
    boolean[] visited;
    int[][] dungeons;
    int max=0;
    
    void recursive(int cur, int cnt){
        max=Math.max(max,cnt);
        
        for(int i=0; i<dungeons.length; i++){
            if(!visited[i] && dungeons[i][0] <= cur){
                visited[i]=true;
                recursive(cur-dungeons[i][1], cnt+1);
                visited[i]=false;
                
            }
              
        }
    }
    
    public int solution(int k, int[][] dungeons) {
        visited=new boolean[dungeons.length];
        this.dungeons=dungeons;
        
        recursive(k, 0);
        
        return max;
    }
}
