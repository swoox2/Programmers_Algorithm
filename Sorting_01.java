import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer=new int[commands.length];
        int cnt=0;
        for(int l=0; l<commands.length; l++){
            ArrayList<Integer> arr=new ArrayList<>();
            int i=commands[l][0];
            int j=commands[l][1];
            int k=commands[l][2];
            
            for(int n=i-1; n<=j-1; n++){
                arr.add(array[n]);
            }
            
            Collections.sort(arr);
            
            for(int m=0; m<arr.size(); m++){
                if(m==k-1) answer[cnt++]=arr.get(m);
            }
        }
        return answer;
        }
    }
