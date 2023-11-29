import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        boolean[] visited=new boolean[strings.length];
        
        Arrays.sort(strings);
        
        String[] str=new String[strings.length];
        for(int i=0; i<strings.length; i++){
            String s=strings[i];
            
            str[i]=s.substring(n,n+1);
        }
        
        Arrays.sort(str);
        
        for(int i=0; i<str.length; i++){
            
            for(int j=0; j<strings.length; j++){
                if(!visited[j] && strings[j].substring(n,n+1).equals(str[i])){
                    visited[j]=true;
                    answer[i]=strings[j];
                    break;
                }
            }
        }
        
        return answer;
    }
}
