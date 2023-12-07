import java.util.*;
class Solution {
    public ArrayList solution(int[] numbers) {
        TreeSet<Integer> set=new TreeSet<>();
        ArrayList<Integer> list=new ArrayList<>();
        
        for(int i=0; i<numbers.length-1; i++){
            for(int j=i+1; j<numbers.length; j++){
                set.add(numbers[i]+numbers[j]);
            }
        }
        
        for(int val : set) list.add(val);
        
        return list;
    }
}
