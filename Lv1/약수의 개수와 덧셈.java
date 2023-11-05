class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for(int i=left; i<=right; i++){
            int cnt=1, cnt2=0;
            while(cnt<=i){
                if(i%cnt==0) cnt2++;
                cnt++;
            }
            if(cnt2%2==0) answer+=i;
            else answer-=i;
        }
        return answer;
    }
}
