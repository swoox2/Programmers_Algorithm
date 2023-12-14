class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        
        int[] c1={-1,0,1,0};
        int[] c2={0,1,0,-1};
        
        String color=board[h][w];
        
        for(int i=0; i<4; i++){
            int nexth=h+c1[i];
            int nextw=w+c2[i];
            
            if(0 <= nexth && nexth < board.length && 0<= nextw && nextw <board[0].length){
                if(color.equals(board[nexth][nextw])) answer++;
            }
        }
        
        return answer;
    }
}
