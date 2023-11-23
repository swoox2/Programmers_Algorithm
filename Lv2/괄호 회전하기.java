import java.util.*;
class Solution {
    Queue<String> q=new LinkedList<>();
    
    public boolean isTrue(Queue<String> q){
        Stack<String> stack=new Stack<>();
        
        for(String val : q){
            if(stack.isEmpty()){
                if(val.equals("]") || val.equals("}") || val.equals(")")) return false;
                else stack.push(val);
            }else{
                if(val.equals("]") && stack.peek().equals("[")) stack.pop();
                else if(val.equals("}") && stack.peek().equals("{")) stack.pop();
                else if(val.equals(")") && stack.peek().equals("(")) stack.pop();
                else stack.push(val);
            }
        }
        
        return stack.isEmpty();
}
    
    public int solution(String s) {
        int answer = 0;
        for(int i=0; i<s.length(); i++) q.add(s.substring(i,i+1));
        
        for(int i=0; i<s.length(); i++){
            //올바른 괄호
            if(isTrue(q)) answer++;
            
            //회전
            q.add(q.poll());
        }
        return answer;
    }
}
