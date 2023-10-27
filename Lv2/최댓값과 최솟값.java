import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        ArrayList<Integer> arr=new ArrayList<>();
        
        String[] str=s.split(" ");
        
        for(String val : str){
            arr.add(Integer.parseInt(val));
        }
        
        Collections.sort(arr);
        
        answer=arr.get(0)+" "+arr.get(arr.size()-1);
        
        
        return answer;
    }
}
