import java.util.*;
class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        
        for(int i=0; i<skill_trees.length; i++){
            String s=skill_trees[i];
            String re="";
            
            for(int j=0; j<s.length(); j++){
                if(skill.contains(s.substring(j,j+1))) re+=s.substring(j,j+1);
            }
            
            if(skill.indexOf(re)==0) answer++;
            
            re="";
        }
        
        return answer;
    }
}
