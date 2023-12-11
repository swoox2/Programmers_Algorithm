class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        
        int start=section[0];
        answer++;
        
        for(int s : section){
            if(start+m > s) continue;
            
            start=s;
            answer++;
        }
        
        return answer;
    }
}
