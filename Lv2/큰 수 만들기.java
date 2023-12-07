import java.util.*;
class Solution {
    public String solution(String number, int k) {
        StringBuilder answer = new StringBuilder();
        
        Stack<Character> stack=new Stack<>();
        
        for(char c : number.toCharArray()){
            
            while(!stack.isEmpty() && k>0 && stack.peek()<c){
                stack.pop();
                k--;
            }
            stack.push(c);
        }
        
        while(k-- >0){
            stack.pop();
        }
        
        for(char c : stack) answer.append(c);
        
        return answer.toString();
    }
}
