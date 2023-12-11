import java.util.*;
class Solution {
    public String solution(String X, String Y) {
        
        HashMap<Integer, Integer> mapX=new HashMap<>();
        HashMap<Integer, Integer> mapY=new HashMap<>();
        
        ArrayList<Integer> list=new ArrayList<>();
        
        for(int i=0; i<X.length(); i++){
            int num=Integer.parseInt(X.substring(i,i+1));
            mapX.put(num, mapX.getOrDefault(num,0)+1);
        }
        
        for(int i=0; i<Y.length(); i++){
            int num=Integer.parseInt(Y.substring(i,i+1));
            mapY.put(num, mapY.getOrDefault(num,0)+1);
        }
        
        for(int keyX : mapX.keySet()){
            for(int keyY : mapY.keySet()){
                if(mapY.containsKey(keyX)){
                    int min=Math.min(mapX.get(keyX), mapY.get(keyX));
                    
                    for(int i=0; i<min; i++) list.add(keyX);
                    break;
                }
            }
        }
        
        Collections.sort(list, Collections.reverseOrder());
        
        StringBuilder sb=new StringBuilder();
        
        if(list.size()==0) return "-1";
        else if(list.get(0)==0) return "0";
        else for(int i=0; i<list.size(); i++) sb.append(list.get(i));
        
        return sb.toString();
    }
}
