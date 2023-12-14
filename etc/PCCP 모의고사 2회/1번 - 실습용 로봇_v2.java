class Solution {
    public int[] solution(String command) {
        int[] answer = new int[2];
        
        int x=0, y=0;
        int dir=0;
        int[] dx={0,1,0,-1};
        int[] dy={1,0,-1,0};
        
        for(char c : command.toCharArray()){
            switch(c){
                case 'R':
                    dir=(dir+1)%4;
                    break;
                case 'L':
                    dir=(dir+3)%4;
                    break;
                case 'G':
                    x+=dx[dir];
                    y+=dy[dir];
                    break;
                case 'B':
                    x-=dx[dir];
                    y-=dy[dir];
                    break;
            }
        }
        
        answer[0]=x;
        answer[1]=y;
        
        return answer;
    }
}
