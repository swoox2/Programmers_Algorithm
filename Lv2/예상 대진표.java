import java.util.*;
class Solution{
    public int solution(int n, int a, int b){
        Queue<Integer> q=new LinkedList<>();
        for(int i=1; i<=n; i++) q.add(i);
        
        int level=0;
        while(q.size()!=1){
            
            int len=q.size()/2;
            level++;
            for(int i=0; i<len; i++){
                int num1=q.poll();
                int num2=q.poll();
            
                if(num1==a && num2==b || num1==b && num2==a) return level;
            
                if(num1==a || num2==a) q.add(a);
                else if(num1==b || num2==b) q.add(b);
                else q.add(num1);
            }
            len/=2;
    
        }
        return 0;
    }
}
