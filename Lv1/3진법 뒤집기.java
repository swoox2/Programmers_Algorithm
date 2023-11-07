import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        
        while(n!=0){
            arr.add(n%3);
            n/=3;
        }
        for(int i=0; i<arr.size(); i++){
            System.out.println(arr.get(i));
        }
        
        for(int i=0; i<arr.size(); i++){
            answer+=Math.pow(3,arr.size()-i-1)*arr.get(i);
        }
        return answer;
    }
}
