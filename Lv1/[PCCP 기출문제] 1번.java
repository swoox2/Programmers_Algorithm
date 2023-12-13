class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        
        int max_h=health;
        
        int endTime=attacks[attacks.length-1][0];
        
        health-=attacks[0][1];
        
        if(attacks.length==1){
            if(health<=0) return -1;
            else return health;
        }else{
            for(int i=1; i<attacks.length; i++){
                int time=attacks[i][0]-attacks[i-1][0]-1; //회복시간
                int sec_h=time*bandage[1]; //초당 회복량
                int add_h=time/bandage[0]*bandage[2]; //추가 회복량
                
                health+=sec_h+add_h;
                
                if(health > max_h) health=max_h;
                
                health-=attacks[i][1];
                
                if(health<=0) return -1;
                
            }
        }
        
        return health;
    }
}
