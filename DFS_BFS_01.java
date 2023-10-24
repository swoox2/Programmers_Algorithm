class Solution {
    int answer,target;
    int[] numbers;
    
    void dfs(int num, int idx){
        if(idx==numbers.length){
            if(num==target) answer++;
            return;
        }
    
        dfs(num+numbers[idx],idx+1);
        dfs(num-numbers[idx],idx+1);
    }
    
    public int solution(int[] numbers, int target) {
        answer=0;
        this.target=target;
        this.numbers=numbers;
        
        dfs(0,0);
        
        return answer;
    }
}
