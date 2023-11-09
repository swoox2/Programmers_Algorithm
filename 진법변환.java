import java.util.*;
public class Main {
    static public boolean conversion(int number, int n){
        String s1="";
        while(number!=0){
            int remain=number%n;
            number/=n;
            s1+=String.valueOf(remain);
        }

        String s2="";
        for(int i=s1.length()-1; i>=0; i--){
            int cnt=0;
            for(int j=0; j< s1.length(); j++){
                if(s1.substring(j,j+1).equals(String.valueOf(i))) cnt++;
            }
            s2+=String.valueOf(cnt);
        }

        if(s1.equals(s2)) return true;
        else return false;
    }

    public static void main(String[] args) {
        int[] number={1210,1425,100,9876};

        for(int j=0; j<number.length; j++){
            int max=-1;
            for(int i=2; i<=10; i++){
                if(conversion(number[j],i)){
                    max=Math.max(max,i);
                }

            }
            System.out.print(max+" ");
        }


    }
}
