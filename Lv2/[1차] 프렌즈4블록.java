class Solution {
    char[][] board_copy;
    
    public int block_cnt(int n, int m){
        boolean[][] visited=new boolean[m][n];
        
        for(int i=0; i<m-1; i++){
            for(int j=0; j<n-1; j++){
                if(board_copy[i][j]=='0') continue;
                if(board_copy[i][j]==board_copy[i][j+1] && board_copy[i][j+1]==board_copy[i+1][j] && board_copy[i+1][j]==board_copy[i+1][j+1]){
                    visited[i][j]=true;
                    visited[i][j+1]=true;
                    visited[i+1][j]=true;
                    visited[i+1][j+1]=true;
                }
            }
        }
        
        int cnt=0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(visited[i][j]){
                    board_copy[i][j]='0';
                    cnt++;
                }
            }
        }
        
        return cnt;
        
    }
    
    public int solution(int m, int n, String[] board) {
        int answer = 0;
        
        board_copy=new char[m][n];
        for(int i=0; i<m; i++) board_copy[i]=board[i].toCharArray();
            
        while(true){
            int cnt=block_cnt(n, m);
            if(cnt==0) break;
            else answer+=cnt;
            
            for(int i=0; i<n; i++){
                for(int j=m-1; j>=0; j--){
                    if(board_copy[j][i]=='0'){
                        for(int l=j-1; l>=0; l--){
                            if(board_copy[l][i]!='0'){
                                board_copy[j][i]=board_copy[l][i];
                                board_copy[l][i]='0';
                                break;
                            }
                        }
                    }
                }
            }
            
        }
          
        return answer;
    }
}
