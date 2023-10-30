import java.util.*;
class Solution {
    public boolean isPrime(int num){
        int lim=(int)Math.sqrt(num);
        
        for(int i=2; i<=lim; i++){
            if(num%i==0) return false;
        }
        return true;
    }
    
    public int solution(int[] nums) {
        int answer = 0;
        
        for(int i=0; i<nums.length-2; i++){
            for(int j=i+1; j<nums.length-1; j++){
                for(int k=j+1; k<nums.length; k++){
                    int n=nums[i]+nums[j]+nums[k];
                    
                    if(isPrime(n)) answer++;
                }
            }
        }

        return answer;
    }
}
