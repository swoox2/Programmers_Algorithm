class Solution {
    public String solution(String number, int k) {
        String answer = "";
        
        int cnt=0;
        while(cnt!=k){
            f or(int i=0; i<number.length()-1; i++){
                int cur=Integer.parseInt(number.substring(i,i+1));
                int next=Integer.parseInt(number.substring(i+1,i+2));
                
                if(cur < next){
                    number=number.substring(0,i)+number.substring(i+1);
                    cnt++;
                    break;
                }else{
                    if(i==number.length()-2){
                        number=number.substring(0, number.length()-(k-cnt));
                        cnt=k;
                    }
                }
            }
        }
        
        return number;
    }
}
