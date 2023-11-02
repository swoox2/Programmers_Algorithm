class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        int j=1;
        for(int i=0; i<n; i++){
            answer[i]=x*(long)j;
            j++;
        }
        return answer;
    }
}
