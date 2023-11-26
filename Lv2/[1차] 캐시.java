import java.util.*;
class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        Queue<String> q=new LinkedList<>();
        
        String[] copy=new String[cities.length];
        for(int i=0; i<cities.length; i++){
            copy[i]=cities[i].toLowerCase();
        }
        
        if(cacheSize==0) return copy.length*5;
        
        for(int i=0; i<copy.length; i++){
            
            if(q.contains(copy[i])){
                q.remove(copy[i]);
                q.add(copy[i]);
                answer++;
            }else{
                if(q.size()==cacheSize){
                    q.poll();
                }
                q.add(copy[i]);
                answer+=5;
            }
        }
        
        return answer;
    }
}
