import java.util.*;
class Solution {
    public String solution(String input_string) {
        String answer = "";
        ArrayList<String> list=new ArrayList<>();
        
        HashMap<String, Integer> map=new HashMap<>();
        for(int i=0; i<input_string.length(); i++){
            String s=input_string.substring(i,i+1);
            map.put(s, map.getOrDefault(s,0)+1);
        }
        
        String s="";
        for(int i=0; i<input_string.length()-1; i++){
            if(!input_string.substring(i,i+1).equals(input_string.substring(i+1,i+2))){
                s+=input_string.substring(i,i+1);
            }
        }
        s+=input_string.substring(input_string.length()-1);
        
        for(String key : map.keySet()){
            
            if(map.get(key)>=2){
                int cnt=0;
                for(int i=0; i<s.length(); i++){
                    if(key.equals(s.substring(i,i+1))) cnt++;
                }
                if(cnt>=2) list.add(key);
            }
            
        }
        
        Collections.sort(list);
        
        if(list.size()==0) return "N";
        else for(String str : list) answer+=str;
        
        return answer;
    }
}
