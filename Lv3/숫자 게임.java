import java.util.*;
class Solution {
    public int solution(int[] A, int[] B) {
        int answer = 0;
        int j=B.length-1;
        
        Arrays.sort(A);
        Arrays.sort(B);
        
        for(int i=A.length-1; i>=0; i--){
            if(B[j]>A[i]){
               j--;
               answer++;
            }
        }
        
        return answer;
    }
}
