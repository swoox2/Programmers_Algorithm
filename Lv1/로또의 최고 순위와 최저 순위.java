class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {6,6};
        int[] arr={6,5,4,3,2};
        
        int zeroCnt=0;
        int sameCnt=0;
        
        for(int i=0; i<lottos.length; i++){
            if(lottos[i]==0) zeroCnt++;
            for(int j=0; j<win_nums.length; j++){
                if(lottos[i]==win_nums[j]){
                    sameCnt++;
                    break;
                }
            }
        }
        
        for(int i=0; i<arr.length; i++) if(zeroCnt+sameCnt==arr[i]) answer[0]=i+1;
        
        for(int i=0; i<arr.length; i++) if(sameCnt==arr[i]) answer[1]=i+1;
        
        return answer;
    }
}
