import java.util.*;
class Solution {
    HashSet<Integer> set=new HashSet<>();
    
    public boolean isPrime(int num){
        if(num==0 || num==1) return false;
        
        int lim=(int)Math.sqrt(num);
        
        for(int i=2; i<=lim; i++){
            if(num%i==0) return false;
        }
        return true;
    }
    
    void recursive(String comb, String others){
        if(!comb.equals("")) set.add(Integer.valueOf(comb));
        
        for(int i=0; i<others.length(); i++){
            recursive(comb+others.charAt(i), others.substring(0,i)+others.substring(i+1));
        }
    }
    
    public int solution(String numbers) {
        int answer = 0;
        
        recursive("",numbers);
        
        Iterator<Integer> it=set.iterator();
        
        while(it.hasNext()){
            int num=it.next();
            if(isPrime(num)) answer++;
        }
        
        return answer;
    }
}
