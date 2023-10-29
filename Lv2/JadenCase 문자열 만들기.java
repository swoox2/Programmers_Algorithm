import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        
        StringTokenizer st=new StringTokenizer(s, " ", true);
        
        while(st.hasMoreTokens()){
            String str=st.nextToken();
            
            if(str.length()==0) answer+=" ";
            else answer+=str.substring(0,1).toUpperCase()+str.substring(1).toLowerCase();
        }
        
        return answer;
    }
}
