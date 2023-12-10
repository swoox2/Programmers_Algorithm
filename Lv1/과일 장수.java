import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        
        ArrayList<Integer> list=new ArrayList<>();
        
        for(int i=0; i<score.length; i++) list.add(score[i]);
        
        Collections.sort(list, Collections.reverseOrder());
        
        int start_idx=m-1;
        while(start_idx < list.size()){
            answer+=list.get(start_idx)*m;
            start_idx+=m;
        }
        
        return answer;
    }
}
