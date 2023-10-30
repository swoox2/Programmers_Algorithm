class Solution {
    public int solution(String t, String p) {
        int answer = 0;

        for(int i=0; i<=t.length()-p.length(); i++){
            String s="";
            for(int j=i; j<p.length()+i; j++){
                s+=t.substring(j,j+1);
            }
            Long num=Long.parseLong(s);
            
            if(num<=Long.parseLong(p)) answer++;
            
        }
        return answer;
    }
}
