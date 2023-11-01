import java.util.*;
class Solution {
    
    public int solution(String dirs) {
        int answer = 0;
        HashSet<String> set=new HashSet<>();
        
        double x=0,y=0;
        for(int i=0; i<dirs.length(); i++){
                
                if(dirs.charAt(i)=='U' && y+1<=5){
                    set.add(x+" "+(y+0.5));
                    y++;
                } 
                
                if(dirs.charAt(i)=='D' && y-1>=-5){
                    set.add(x+" "+(y-0.5));
                    y--;
                }
                
                if(dirs.charAt(i)=='R' && x+1<=5){
                    set.add((x+0.5)+" "+y);
                    x++;
                }
                
                if(dirs.charAt(i)=='L' && x-1>=-5){
                    set.add((x-0.5)+" "+y);
                    x--;
                }

        }

        answer=set.size();
        
        return answer;
    }
}
