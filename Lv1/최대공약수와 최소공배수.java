import java.util.*;
class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int a=Math.max(n,m);
        int b=Math.min(n,m);
        
        while(b!=0){
            int r=a%b;
            a=b;
            b=r;
        }
        answer[0]=a;
        answer[1]=n*m/a;
        
        return answer;
    }
}
