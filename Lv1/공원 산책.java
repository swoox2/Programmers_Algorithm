import java.util.*;
class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        
        for(int i=0; i<park.length; i++){
            for(int j=0; j<park[i].length(); j++){
                if(park[i].charAt(j)=='S'){
                    answer[0]=i;
                    answer[1]=j;
                }
            }
        }
        
        int colLastIdx=park[0].length()-1;
        int rowLastIdx=park.length-1;
        
        for(int i=0; i<routes.length; i++){
            String[] route=routes[i].split(" ");
            String dir=route[0];
            int move=Integer.parseInt(route[1]);
            
            
            switch(dir){
                case "E":
                    if(answer[1]+move>colLastIdx) continue;
                    boolean isXE=false;
                    for(int j=answer[1]+1; j<=answer[1]+move; j++){
                        if(park[answer[0]].charAt(j)=='X'){
                            isXE=true;
                            break;
                        }
                    }
                    if(!isXE) answer[1]+=move;
                    break;
                case "W":
                    if(answer[1]-move<0) continue;
                    boolean isXW=false;
                    for(int j=answer[1]-1; j>=answer[1]-move; j--){
                        if(park[answer[0]].charAt(j)=='X'){
                            isXW=true;
                            break;
                        }
                    }
                    if(!isXW) answer[1]-=move;
                    break;
                case "N":
                    if(answer[0]-move<0) continue;
                    boolean isXN=false;
                    for(int j=answer[0]-1; j>=answer[0]-move; j--){
                        if(park[j].charAt(answer[1])=='X'){
                            isXN=true;
                            break;
                        }
                    }
                    if(!isXN) answer[0]-=move;
                    break;
                case "S":
                    if(answer[0]+move>rowLastIdx) continue;
                    boolean isXS=false;
                    for(int j=answer[0]+1; j<=answer[0]+move; j++){
                        if(park[j].charAt(answer[1])=='X'){
                            isXS=true;
                            break;
                        }
                    }
                    if(!isXS) answer[0]+=move;
                    break;
            }
            
        }
        
        return answer;
    }
}
