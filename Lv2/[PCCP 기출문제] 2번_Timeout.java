import java.util.*;
class Solution {
    int[][] land;
    boolean[][] visited;
    int[] c1={-1,0,1,0};
    int[] c2={0,1,0,-1};
    int cnt=0;
    
    void dfs(int x, int y){
        visited[x][y]=true;
        cnt++;
        
        for(int i=0; i<4; i++){
            int nx=x+c1[i];
            int ny=y+c2[i];
            
            if(0<=nx && nx<land.length && 0<= ny && ny<land[0].length && land[nx][ny]==1 && !visited[nx][ny]){
                dfs(nx,ny);
            }
        }
        
    }
    
    public int solution(int[][] land) {
        int max=0;
        this.land=land;
        
        for(int i=0; i<land[0].length; i++){
            visited=new boolean[land.length][land[0].length];
            for(int j=0; j<land.length; j++){
                if(land[j][i]==1 && !visited[j][i]){
                    dfs(j,i);
                    max=Math.max(cnt,max);
                }
            }
            cnt=0;
        }
        return max;
    }
}
