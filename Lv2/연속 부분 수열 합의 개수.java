import java.util.*;
class Solution {
    public int solution(int[] elements) {
        int answer = 0;
        int[] arr=new int[elements.length*2];
        for(int i=0,j=0; i<arr.length; i++){
            if(i==elements.length) j=0;
            arr[i]=elements[j];
            j++;
            
        }
        
        HashSet<Integer> set=new HashSet<>();
        
        for(int i=1; i<=elements.length; i++){
            for(int j=0; j<elements.length; j++){
                int sum=0;
                for(int l=j; l<j+i; l++){
                    sum+=arr[l];
                }
                set.add(sum);
            }
        }
        answer=set.size();
        
        return answer;
    }
}
