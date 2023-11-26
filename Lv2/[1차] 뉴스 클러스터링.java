import java.util.*;
class Solution {
    public int solution(String str1, String str2) {
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        
        HashMap<String, Integer> map1=new HashMap<>();
        
        int cnt_str1=0;
        for(int i=0; i<str1.length()-1; i++){
            if(97 <=str1.charAt(i) && str1.charAt(i)<=122 && 97<=str1.charAt(i+1) && str1.charAt(i+1)<=122){
                map1.put(str1.substring(i,i+2), map1.getOrDefault(str1.substring(i,i+2),0)+1);
                cnt_str1++;
            }
        }
        
        HashMap<String, Integer> map2=new HashMap<>();
    
        int cnt_str2=0;
        for(int i=0; i<str2.length()-1; i++){
            if(97 <=str2.charAt(i) && str2.charAt(i)<=122 && 97<=str2.charAt(i+1) && str2.charAt(i+1)<=122){
                map2.put(str2.substring(i,i+2), map2.getOrDefault(str2.substring(i,i+2),0)+1);
                cnt_str2++;
            }
        }

        int cross=0;
        for(String key : map2.keySet()){
            if(map1.containsKey(key)){
                cross+=Math.min(map1.get(key), map2.get(key));
            }
        }
        if(cnt_str1==0 && cnt_str2==0) return 65536;
        
        int union=cnt_str1+cnt_str2-cross;

        double answer=(double)cross/union*65536;
        
        return (int)answer;
    }
}
