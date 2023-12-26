import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        
        HashMap<String, Integer> map=new HashMap<>();
        
        for(int i=0; i<players.length; i++) map.put(players[i], i);
        
        for(String calling : callings){
            int curIdx=map.get(calling);
            String prevPlayer=players[curIdx-1];
            
            players[curIdx]=prevPlayer;
            players[curIdx-1]=calling;
            
            map.put(calling, curIdx-1);
            map.put(prevPlayer, curIdx);
        }
        
        return players;
    }
}
