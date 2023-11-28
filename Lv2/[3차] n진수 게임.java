import java.util.*;
class Solution {
    public String solution(int n, int t, int m, int p) {
        String answer = "";
        
        ArrayList<String> list=new ArrayList<>();
        for(int i=0; i<=t*m; i++){
            String s=Integer.toString(i,n);
            
            for(int j=0; j<s.length(); j++){
                list.add(s.substring(j,j+1));
            }
        }
        
        int cnt=0;
        int start_idx=p-1;
        while(cnt!=t){
            cnt++;
            answer+=list.get(start_idx);
            start_idx+=m;
        }
        
        return answer.toUpperCase();
    }
}
