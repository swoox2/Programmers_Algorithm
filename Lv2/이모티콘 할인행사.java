class Solution {
    int[][] users;
    int[] emoticons;
    int[] answer;
    
    void dfs(int idx, int[] arr){
        if(idx==emoticons.length){
            int total_sum=0;
            int cnt=0;
            
            for(int i=0; i<users.length; i++){
                int per=users[i][0];
                int price=users[i][1];
                
                int sum=0;
                for(int j=0; j<emoticons.length; j++){
                    if(arr[j]>=per) sum+=emoticons[j]*(100-arr[j])/100;
                }
                
                if(price<=sum) cnt++;
                else total_sum+=sum;
            }
            
            if(answer[0]<cnt){
                answer[0]=cnt;
                answer[1]=total_sum;
            }else if(answer[0]==cnt){
                if(answer[1]<total_sum) answer[1]=total_sum;
            }
            
            return;
        }
        
        for(int i=10; i<=40; i+=10){
            arr[idx]=i;
            dfs(idx+1,arr);
        }
    }
    
    public int[] solution(int[][] users, int[] emoticons) {
        this.users=users;
        this.emoticons=emoticons;
        answer = new int[2];
        int[] arr=new int[emoticons.length];
        
        dfs(0,arr);
        
        return answer;
    }
}
