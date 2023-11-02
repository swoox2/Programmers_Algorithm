class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int cnt1 = 0; int cnt2 = 0;
        for(char c: s.toCharArray()){
            if(c=='p' || c=='P'){
                cnt1++;
            }else if(c=='y' || c=='Y'){
                cnt2++;
            }
        }
        if(cnt1==cnt2){
            answer=true;
        }else if(cnt1!=cnt2){
            answer=false;
        }
        return answer;
    }
}
