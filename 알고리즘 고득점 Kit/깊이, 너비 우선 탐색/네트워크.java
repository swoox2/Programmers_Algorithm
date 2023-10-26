import java.util.*;
class Solution {
    int answer,n;
    int[][] computers;
    boolean[] visited;
    
    void dfs(int idx){
        visited[idx]=true;
        
        for(int i=0; i<n; i++){
            if(!visited[i] && computers[idx][i]==1){
                dfs(i);
            }
        }
        
    }
    
    public int solution(int n, int[][] computers) {
        answer = 0;
        this.n=n;
        this.computers=computers;
        visited=new boolean[n];
        
        for(int i=0; i<n; i++){
            if(!visited[i]){
                dfs(i);
                answer++;
            }
        }
        
        return answer;
    }
}
