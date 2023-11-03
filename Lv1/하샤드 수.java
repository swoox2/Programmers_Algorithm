class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int sum=0; int x2=x;
        while(x!=0){
            sum+=x%10;
            x/=10;
        }
        if(x2%sum!=0){
            answer=false;
        }
        return answer;
    }
}
