import java.util.*;
class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int[] dart=new int[3];
        
        int idx=0;
        String s="";
        for(int i=0; i<dartResult.length(); i++){
            char c=dartResult.charAt(i);
            
            if('0'<=c && c<='9'){ //숫자
                s+=c;
            }else if(c=='S' || c=='D' || c=='T'){ //보너스
                int n=Integer.parseInt(s);
                
                if(c=='S') n=(int)Math.pow(n,1);
                else if(c=='D') n=(int)Math.pow(n,2);
                else n=(int)Math.pow(n,3);
                
                dart[idx++]=n;
                s="";
            }else{ //옵션
                if(c=='#'){
                    dart[idx-1]*=-1;
                }else{
                    if(idx==1){
                        dart[idx-1]*=2;
                    }else{
                        dart[idx-1]*=2;
                        dart[idx-2]*=2;
                    }
                }
            }
            
        }
        
        answer=dart[0]+dart[1]+dart[2];
        
        return answer;
    }
}
