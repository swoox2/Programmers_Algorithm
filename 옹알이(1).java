import java.util.*;
class Solution {
    boolean[] visited;
    String[] babbling;
    HashSet<String> set=new HashSet<>();
    String[] s={"aya", "ye", "woo", "ma"};
    
    void recursive(String comb){
        
        if(!comb.equals("")) set.add(comb);
        
        for(int i=0; i<s.length; i++){
            if(!visited[i]){
                visited[i]=true;
                recursive(comb+s[i]);
                visited[i]=false;
            }
        }
    }
    
    public int solution(String[] babbling) {
        int answer = 0;
        this.babbling=babbling;
        visited=new boolean[s.length];
        
        recursive("");
        
        Iterator<String> it=set.iterator();
        
        while(it.hasNext()){
            String next=it.next();
            
            for(String s : babbling) if(next.equals(s)) answer++;
        }
                
        return answer;
    }
}
