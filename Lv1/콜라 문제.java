class Solution {
    public int solution(int a, int b, int n) {
        int answer=0;
        
        while(n >= a){
            int remain=n%a;
            int q=n/a;
            
            n=q*b+remain;
            
            answer+=q*b;
        }
        
        return answer;
    }
}
