import java.util.*;
class Solution {
    public ArrayList solution(int[] answers) {
        ArrayList<Integer> list=new ArrayList<>();
        HashMap<Integer, Integer> map=new HashMap<>();
        int[] first={1,2,3,4,5};
        int[] second={2,1,2,3,2,4,2,5};
        int[] third={3,3,1,1,2,2,4,4,5,5};
        int cnt_f=0, cnt_s=0, cnt_t=0;
        
        for(int i=0; i<answers.length; i++){
            if(answers[i]==first[i%5]) cnt_f++;
        }
        for(int i=0; i<answers.length; i++){
            if(answers[i]==second[i%8]) cnt_s++;
        }
        for(int i=0; i<answers.length; i++){
            if(answers[i]==third[i%10]) cnt_t++;
        }
        
        map.put(1, cnt_f);
        map.put(2, cnt_s);
        map.put(3, cnt_t);
        
        int max=0;
        for(int key : map.keySet()){
            max=Math.max(max,map.get(key));
        }
        
        for(int key : map.keySet()){
            if(map.get(key)==max) list.add(key);
        }
        
        return list;
    }
}
