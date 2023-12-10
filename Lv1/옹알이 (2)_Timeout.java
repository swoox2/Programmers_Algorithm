class Solution {
    String[] b={"aya", "ye", "woo", "ma"};
    int answer;
    String[] babbling;
    
    void dfs(String s, int cnt){
        if(cnt>15) return;
        
        for(int i=0; i<babbling.length; i++){
            if(babbling[i].equals(s)) answer++;
        }
        
        for(int i=0; i<b.length; i++){
            if(s.length() < b[i].length()){
                dfs(s+b[i], cnt+1);
            }else{
                if(!s.substring(s.length()-b[i].length()).equals(b[i])){
                    dfs(s+b[i], cnt+1);
                }
            }
        }
    }
    
    public int solution(String[] babbling) {
        answer = 0;
        this.babbling=babbling;
        
        dfs("",0);
        
        return answer;
    }
}
