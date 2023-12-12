import java.util.*;
class Solution {
    int[][] ability;
    boolean[] visited;
    int answer;
    
    void dfs(int sum, int j){
        if(j==ability[0].length){
            answer=Math.max(answer, sum);
            return;
        }
        
        for(int i=0; i<ability.length; i++){
            if(!visited[i]){
                visited[i]=true;
                dfs(sum+ability[i][j], j+1);
                visited[i]=false;
            }
            
        }
    }
    
    public int solution(int[][] ability) {
        answer = 0;
        this.ability=ability;
        visited=new boolean[ability.length];
        
        dfs(0,0);
        
        return answer;
    }
}
