import java.util.*;
class Solution {
    public String solution(String new_id) {
        String answer = "";
        
        //1단계
        new_id=new_id.toLowerCase();
        
        //2단계
        StringBuilder sb=new StringBuilder();
        for(int i=0; i<new_id.length(); i++){
            char c=new_id.charAt(i);
            if('a'<=c && c<='z' || '0'<=c && c<='9' || c=='-' || c=='_' || c=='.'){
                sb.append(c);
            }
        }
        
        new_id=sb.toString();
        
        //3단계
        Stack<Character> stack=new Stack<>();
        for(int i=0; i<new_id.length(); i++){
            char c=new_id.charAt(i);
            if(stack.isEmpty()) stack.push(c);
            else{
                if(stack.peek()=='.' && c=='.') continue;
                else stack.push(c);
            }
        }
        
        for(char c : stack) answer+=c;
        
        //4단계
        if(!answer.isEmpty() && answer.charAt(0)=='.') answer=answer.substring(1);
        if(!answer.isEmpty() && answer.charAt(answer.length()-1)=='.') answer=answer.substring(0,answer.length()-1);
        
        //5단계
        if(answer.equals("")) answer="a";
        
        //6단계
        if(answer.length()>=16) answer=answer.substring(0,15);
        if(answer.charAt(answer.length()-1)=='.') answer=answer.substring(0,answer.length()-1);
        
        //7단계
        if(answer.length()<=2){
            while(answer.length()!=3) answer+=answer.substring(answer.length()-1, answer.length());
        }
        
        return answer;
    }
}
