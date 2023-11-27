class Solution {
    int num=0,answer=0;
    String word;
    String[] str_arr={"A","E","I","O","U"};
    
    public void dfs(String s){
        num++;
        if(s.equals(word)) answer=num;
        
        if(s.length()==5) return;
        
        for(int i=0; i<str_arr.length; i++){
            dfs(s+str_arr[i]);
        }
    }
    public int solution(String word) {
        this.word=word;
    
        dfs("");
        
        return answer-1;
    }
}
