import java.util.*;
class Node{
    int x,y;
    Node(int x, int y){
        this.x=x;
        this.y=y;
    }
}

class Solution {
    int[][] maps;
    boolean[][] visited;
    int answer,row,col;
    int[] c1={-1,0,1,0};
    int[] c2={0,1,0,-1};
    Queue<Node> q=new LinkedList<>();
    
    void bfs(){
        
    while(!q.isEmpty()){
            
        Node cur=q.poll();
        int x=cur.x;
        int y=cur.y;
        visited[x][y]=true;
                
        for(int j=0; j<4; j++){
            int nx=x+c1[j];
            int ny=y+c2[j];
                    
            if(0<=nx && nx<row && 0<=ny && ny<col && !visited[nx][ny] && maps[nx][ny]==1){
                q.add(new Node(nx,ny));
                maps[nx][ny]=maps[x][y]+1;
                        
            }
                    
        }
            
    }
}
    
    public int solution(int[][] maps) {
        answer = 0;
        row=maps.length;
        col=maps[0].length;
        this.maps=maps;
        
        visited=new boolean[row][col];
        
        q.add(new Node(0,0));
        
        bfs();
        
        if(visited[row-1][col-1]) return maps[row-1][col-1];
        else return -1;
    }
}
