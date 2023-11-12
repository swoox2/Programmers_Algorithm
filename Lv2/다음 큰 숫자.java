class Solution {
    public int solution(int n) {
        int answer = 0;
        int copy=n;
        int cnt_one=0;
        while(copy!=0){
            int remain=copy%2;
            if(remain==1) cnt_one++;
            copy/=2;
        }
        
        for(int i=n+1; i<1000000; i++){
            int tmp=i;
            int cnt=0;
            while(tmp!=0){
                int remain=tmp%2;
                if(remain==1) cnt++;
                tmp/=2;
            }
            if(cnt_one==cnt){
                answer=i;
                break;
            }
        }
        
        return answer;
    }
}
