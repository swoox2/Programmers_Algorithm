import java.util.*;
class Solution {
    int answer;
    String begin, target;
    String[] words;
    boolean[] visited;
    Queue<String> q=new LinkedList<>();
    
    public int bfs(){
        
        while(!q.isEmpty()){
            int len=q.size();
            
            for(int i=0; i<len; i++){
                String cur=q.poll();
                if(cur.equals(target)) return answer;
                
                for(int j=0; j<words.length; j++){
                    
                    int cnt=0;
                    for(int k=0; k<cur.length(); k++){
                        if(cur.charAt(k)!=words[j].charAt(k)) cnt++;
                    }
                    
                    if(cnt==1 && !visited[j]){
                        q.add(words[j]);
                        visited[j]=true;
                    } 
                }
                
            }
            answer++;
        }
        return 0;
    }
    
    public int solution(String begin, String target, String[] words) {
        answer = 0;
        this.begin=begin;
        this.target=target;
        this.words=words;
        visited=new boolean[words.length];
        
        q.add(begin);
        
        return bfs();
    }
}
