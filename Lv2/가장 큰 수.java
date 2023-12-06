import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        
        String[] s=new String[numbers.length];
        for(int i=0; i<numbers.length; i++) s[i]=String.valueOf(numbers[i]);
        
        Comparator<String> comp=new Comparator<String>(){
            @Override
            public int compare(String s1, String s2){
                return (s2+s1).compareTo(s1+s2);
            }
        };
        
        Arrays.sort(s, comp);
        
        if(s[0].equals("0")) return "0";
        
        for(int i=0; i<s.length; i++) answer+=s[i];
        
        return answer;
    }
}
