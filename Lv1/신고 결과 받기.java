import java.util.*;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        
        HashMap<String, Integer> mapIdx=new HashMap<>();
        HashMap<String, HashSet<String>> map=new HashMap<>();
        
        for(int i=0; i<id_list.length; i++){
            mapIdx.put(id_list[i], i);
            map.put(id_list[i], new HashSet<>());
        }
        
        for(String s : report){
            String[] str=s.split(" ");
            String first=str[0];
            String last=str[1];
            
            map.get(last).add(first);
        }
        
        for(String key : map.keySet()){
            if(map.get(key).size() >= k){
                HashSet<String> set=map.get(key);
                for(String id : set){
                    answer[mapIdx.get(id)]++;
                }
            }
        }
        
        return answer;
    }
}
