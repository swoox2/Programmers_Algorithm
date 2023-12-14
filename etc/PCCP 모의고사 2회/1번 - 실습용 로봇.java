class Solution {
    public int[] solution(String command) {
        int[] answer = new int[2];
        
        int x=0, y=0;
        int dir=0;
        
        for(char c : command.toCharArray()){
            switch(c){
                case 'R':
                    dir=(dir+1)%4;
                    break;
                case 'L':
                    dir=(dir+3)%4;
                    break;
                case 'G':
                    if(dir==0) y++;
                    else if(dir==1) x++;
                    else if(dir==2) y--;
                    else x--;
                    break;
                case 'B':
                    if(dir==0) y--;
                    else if(dir==1) x--;
                    else if(dir==2) y++;
                    else x++;
                    break;
            }
        }
        
        answer[0]=x;
        answer[1]=y;
        
        return answer;
    }
}
