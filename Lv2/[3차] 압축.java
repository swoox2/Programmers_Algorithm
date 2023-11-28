import java.util.*;
class Solution {
    public ArrayList solution(String msg) {
        ArrayList<Integer> answer=new ArrayList<>();
        
        ArrayList<String> list=new ArrayList<>();
        
        list.add("");
        
        for(char c='A'; c<='Z'; c++) list.add(String.valueOf(c));
        
        for(int i=0; i<msg.length(); i++){
            for(int j=msg.length()-1; j>=i; j--){
                if(list.contains(msg.substring(i,j+1))){
                    answer.add(list.indexOf(msg.substring(i,j+1)));
                    if(j!=msg.length()-1){
                        list.add(msg.substring(i,j+2));
                    }
                    i+=j-i;
                    break;
                }
            }
        }

        
        return answer;
    }
}
