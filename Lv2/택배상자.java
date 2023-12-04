import java.util.*;
class Solution {
    public int solution(int[] order) {
        int answer = 0;
        Stack<Integer> stack=new Stack<>();
        
        int index=0;
        for(int i=1; i<=order.length; i++){
            if(order[index]!=i){
                stack.add(i);
            }else{
                answer++;
                index++;
            }
            
            while(!stack.isEmpty() && order[index]==stack.peek()){
                stack.pop();
                answer++;
                index++;
            }
        }
        
        return answer;
    }
}
