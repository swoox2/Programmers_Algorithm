class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        answer[0]=-1;
        for(int i=1; i<s.length(); i++){
            int cnt=0;
            for(int j=i-1; j>=0; j--){
                cnt++;
                if(s.charAt(i)==s.charAt(j)){
                    answer[i]=cnt;
                    break;
                }
                else answer[i]=-1;
            }
        }
        
        return answer;
    }
}
