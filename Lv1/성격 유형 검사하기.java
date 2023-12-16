import java.util.*;
class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        String[] str={"RT", "CF", "JM", "AN"};
        
        HashMap<Character, Integer> map=new HashMap<>();
        for(int i=0; i<str.length; i++){
            String s=str[i];
            map.put(s.charAt(0), 0);
            map.put(s.charAt(1), 0);
        }
        
        for(int i=0; i<survey.length; i++){
            String s=survey[i];
            
            if(1<=choices[i] && choices[i]<=3){
                switch(choices[i]){
                    case 1:
                        map.put(s.charAt(0), map.get(s.charAt(0))+3);
                        break;
                    case 2:
                        map.put(s.charAt(0), map.get(s.charAt(0))+2);
                        break;
                    case 3:
                        map.put(s.charAt(0), map.get(s.charAt(0))+1);
                        break;
                }
            }
            if(5<=choices[i] && choices[i]<=7){
                switch(choices[i]){
                    case 5:
                        map.put(s.charAt(1), map.get(s.charAt(1))+1);
                        break;
                    case 6:
                        map.put(s.charAt(1), map.get(s.charAt(1))+2);
                        break;
                    case 7:
                        map.put(s.charAt(1), map.get(s.charAt(1))+3);
                        break;
                }
            }
        }
        
        for(int i=0; i<str.length; i++){
            String s=str[i];
            
            if(map.get(s.charAt(0)) >= map.get(s.charAt(1))) answer+=s.charAt(0);
            else answer+=s.charAt(1);
        }
        
        return answer;
    }
}
