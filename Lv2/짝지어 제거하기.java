import java.util.*;
class Solution{
    public int solution(String s){
        int answer=0;
        Stack<String> stack=new Stack<>();
        
        for(int i=0; i<s.length(); i++){
            if(i==0) stack.add(s.substring(i,i+1));
            else{
                if(!stack.isEmpty() && stack.peek().equals(s.substring(i,i+1))) stack.pop();
                else stack.add(s.substring(i,i+1));
            }
        }
        
        if(stack.isEmpty()) answer=1;

        return answer;
    }
}
