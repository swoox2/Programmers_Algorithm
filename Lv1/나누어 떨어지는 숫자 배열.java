import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int len=0, cnt=0; int[] no= {-1};
        for(int i=0; i<arr.length; i++){
            if(arr[i]%divisor==0) len++;
            if(arr[i]%divisor!=0) cnt++;
        }
        if(cnt==arr.length){
            return no;
        }
        int[] answer = new int[len];
        int index=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%divisor==0) answer[index++] = arr[i];
        }
        Arrays.sort(answer);
        
        return answer;
    }
}
