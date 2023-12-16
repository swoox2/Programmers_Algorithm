import java.util.*;
class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        
        ArrayList<Character> list=new ArrayList<>();
        
        for(int i=97; i<=122; i++) list.add((char)i);
        
        for(int i=0; i<skip.length(); i++){
            for(int j=0; j<list.size(); j++){
                if(skip.charAt(i)==list.get(j)){
                    list.remove(j);
                    break;
                }
            }
        }
        
        for(int i=0; i<s.length(); i++){
            for(int j=0; j<list.size(); j++){
                if(s.charAt(i)==list.get(j)){
                    answer+=list.get((j+index)%list.size());
                    break;
                }
            }
        }
        
        return answer;
    }
}
