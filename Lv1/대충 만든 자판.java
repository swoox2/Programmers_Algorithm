import java.util.*;
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        
        for(int i=0; i<targets.length; i++){
            String s=targets[i];
            int sum=0;
            
            for(char c1 : s.toCharArray()){
                int min=Integer.MAX_VALUE;
                boolean found=false;
                
                for(int j=0; j<keymap.length; j++){
                    String str=keymap[j];
                    
                    for(int l=0; l<str.length(); l++){
                        if(str.charAt(l)==c1){
                            min=Math.min(min, l+1);
                            found=true;
                            break;
                        }
                    }
                    
                }
                if(!found){
                    sum=-1;
                    break;
                }
                sum+=min;
            }
            answer[i]=sum;
        }
        
        return answer;
    }
}
