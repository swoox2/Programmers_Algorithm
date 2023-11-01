class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for(int i=0; i<n; i++){
            int a1=arr1[i];
            int a2=arr2[i];
            
            int[] a1_arr=new int[n];
            int[] a2_arr=new int[n];
            
            int cnt1=n-1;
            while(a1!=0){
                a1_arr[cnt1--]=a1%2;
                a1/=2;
            }
            
            int cnt2=n-1;
            while(a2!=0){
                a2_arr[cnt2--]=a2%2;
                a2/=2;
                
            }
            
            String s="";
            for(int j=0; j<n; j++){
                if(a1_arr[j]==0 && a2_arr[j]==0) s+=" ";
                else s+="#";
            }
            
            answer[i]=s;
            
        }
        
        return answer;
    }
}
