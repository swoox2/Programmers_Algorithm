import java.util.*;
class Solution {
    public boolean isPrime(String s){
        for(int i=0; i<s.length(); i++){
            if(s.substring(i,i+1).equals("0")) return false;
        }
        
        long num=Long.parseLong(s);
        
        if(num==1) return false;
        
        int lim=(int)Math.sqrt(num);
        
        for(int i=2; i<=lim; i++){
            if(num%i==0) return false;
        }
        
        return true;
        
    }
    public int solution(int n, int k) {
        int answer = 0;
        
        Stack<Integer> stack=new Stack<>();
        
        //진법변환
        while(n!=0){
            stack.push(n%k);
            n/=k;
        }
    
        int len=stack.size();
        
        String s="";
        for(int i=0; i<len; i++) s+=String.valueOf(stack.pop());
        
        String[] str_arr=s.split("0");
        
        for(int i=0; i<str_arr.length; i++) if(!str_arr[i].isEmpty() && isPrime(str_arr[i])) answer++;
        
        return answer;
    }
}
