import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
        String s = Long.toString(n);
        
        char[] c = s.toCharArray();
        Arrays.sort(c);
        
        String s2 = "";
        for(int i=c.length-1; i>=0; i--){
            s2+=c[i];
        }
        answer=Long.parseLong(s2);
        return answer;
    }
}
