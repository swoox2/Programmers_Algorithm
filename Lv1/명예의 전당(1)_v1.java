import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        
        Stack<Integer> stack=new Stack<>();
        
        for(int i=0; i<score.length; i++){
            if(stack.size()<k){
                stack.push(score[i]);
            }else{
                if(stack.peek() < score[i]){
                    stack.pop();
                    stack.push(score[i]);
                }
            }
            Collections.sort(stack, Collections.reverseOrder());
            answer[i]=stack.peek();
        }
        
        return answer;
    }
}
