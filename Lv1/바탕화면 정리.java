class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        
        boolean isMaxRow=false;
        //가장 높은 행
        for(int i=0; i<wallpaper.length; i++){
            for(int j=0; j<wallpaper[0].length(); j++){
                if(wallpaper[i].charAt(j)=='#'){
                    answer[0]=i;
                    isMaxRow=true;
                    break;
                }
            }
            if(isMaxRow) break;
        }
        
        boolean isLeftCol=false;
        //가장 왼쪽 열
        for(int i=0; i<wallpaper[0].length(); i++){
            for(int j=0; j<wallpaper.length; j++){
                if(wallpaper[j].charAt(i)=='#'){
                    answer[1]=i;
                    isLeftCol=true;
                    break;
                } 
            }
            if(isLeftCol) break;
        }
        
        boolean isMinRow=false;
        //가장 낮은 행
        for(int i=wallpaper.length-1; i>=0; i--){
            for(int j=0; j<wallpaper[0].length(); j++){
                if(wallpaper[i].charAt(j)=='#'){
                    answer[2]=i+1;
                    isMinRow=true;
                    break;
                }
            }
            if(isMinRow) break;
        }
        
        boolean isRightCol=false;
        //가장 오른쪽 열
        for(int i=wallpaper[0].length()-1; i>=0; i--){
            for(int j=0; j<wallpaper.length; j++){
                if(wallpaper[j].charAt(i)=='#'){
                    answer[3]=i+1;
                    isRightCol=true;
                    break;
                }
            }
            if(isRightCol) break;
        }
        
        
        return answer;
    }
}
