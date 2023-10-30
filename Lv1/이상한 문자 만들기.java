import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        
        StringTokenizer st=new StringTokenizer(s, " ", true);
        
        while(st.hasMoreTokens()){
            String str=st.nextToken();
            
            if(str.equals(" ")) answer+=" ";
            else{
                for(int i=0; i<str.length(); i++){
                    if(i%2==0) answer+=str.substring(i,i+1).toUpperCase();
                    else answer+=str.substring(i,i+1).toLowerCase();
                }
            }
        }
        
        return answer;
    }
}
