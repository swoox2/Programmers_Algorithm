import java.util.*;
public class Solution {
    public ArrayList solution(int []arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);
        
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]!=arr[i+1])answer.add(arr[i+1]);
        }

        return answer;
    }
}
