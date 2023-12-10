import java.util.*;
class Solution {
    public int count(int num){
        
        int lim=(int)Math.sqrt(num);
        
        int cnt=0;
        for(int i=1; i<=lim; i++){
            if(num%i==0){
                if(num/i==i) cnt++;
                else cnt+=2;
            }
        }
        
        return cnt;
    }
    
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        for(int i=1; i<=number; i++){
            int cnt=count(i);
            
            if(cnt>limit) answer+=power;
            else answer+=cnt;
        }
        
        return answer;
    }
}
