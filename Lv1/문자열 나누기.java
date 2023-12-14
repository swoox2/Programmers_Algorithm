import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
    
        Stack<Character> stack=new Stack<>();
        
        for(char c : s.toCharArray()){
            if(stack.isEmpty()){
                stack.push(c);
            }else{
                if(stack.peek()==c){
                    stack.push(c);
                }else{
                    stack.pop();
                }
            }
            
            if(stack.isEmpty()) answer++;
        }
        
        if(!stack.isEmpty()) answer++;
        
        return answer;
    }
}
