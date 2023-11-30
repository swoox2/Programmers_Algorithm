import java.util.*;
class Solution {
    public ArrayList solution(String[] record) {
        ArrayList<String> answer=new ArrayList<>();
        
        HashMap<String, String> map=new HashMap<>();
        
        for(int i=0; i<record.length; i++){
            String[] str=record[i].split(" ");
            if(str[0].equals("Leave")) continue;
            
            String s1=str[0]; //Enter or Leave or Change
            String s2=str[1]; //유저 아이디
            String s3=str[2]; //닉네임
            
            map.put(s2,s3);
        }
        
        
        for(int i=0; i<record.length; i++){
            String[] str=record[i].split(" ");
            
            if(str[0].equals("Enter")){
                answer.add(map.get(str[1])+"님이 들어왔습니다.");
            }else if(str[0].equals("Leave")){
                answer.add(map.get(str[1])+"님이 나갔습니다.");
            }else continue;
            
            
        }
        
        return answer;
    }
}
