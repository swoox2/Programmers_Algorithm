import java.util.*;
class Solution {
    public String[] solution(int[][] queries) {
        String[] answer = new String[queries.length];
        String[] s={"RR", "Rr", "Rr","rr"};
        
        Queue<String> q=new LinkedList<>();
        
        for(int i=0; i<queries.length; i++){
            int generation=queries[i][0]; //3
            int num=queries[i][1]; //5
            boolean isTrue=false;
            
            q.add("Rr");
            int L=1;
            
            while(!q.isEmpty()){
                int size=q.size();
                
                for(int j=0; j<size; j++){
                    String cur=q.poll();
                    
                    if(L==generation && j+1==num){
                        answer[i]=cur;
                        isTrue=true;
                        break;
                    }
                    
                    if(cur.equals("Rr")){
                        for(int l=0; l<4; l++) q.add(s[l]);
                    }else if(cur.equals("RR")){
                        for(int l=0; l<4; l++) q.add("RR");
                    }else{
                        for(int l=0; l<4; l++) q.add("rr");
                    }
                }
                if(isTrue) break;
                L++;
                
            }
            q.clear();
        }
        
        return answer;
    }
}
