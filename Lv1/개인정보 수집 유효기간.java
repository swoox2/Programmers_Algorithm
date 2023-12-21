import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
    public ArrayList solution(String today, String[] terms, String[] privacies) {
        ArrayList<Integer> list=new ArrayList<>();

        HashMap<String, Integer> map=new HashMap<>();
        for(int i=0; i<terms.length; i++) map.put(terms[i].substring(0,1), Integer.parseInt(terms[i].substring(2))*28);

        String[] todayArr=today.split("\\.");
        int todayYear=Integer.parseInt(todayArr[0]);
        int todayMonth=Integer.parseInt(todayArr[1]);
        int todayDate=Integer.parseInt(todayArr[2]);

        for(int i=0; i<privacies.length; i++){
            String[] date=privacies[i].substring(0,10).split("\\.");
            String t=privacies[i].substring(11);

            int dateYear=Integer.parseInt(date[0]);
            int dateMonth=Integer.parseInt(date[1]);
            int dateDate=Integer.parseInt(date[2]);

            int diff=0;
            diff+=(todayYear-dateYear)*(28*12);
            diff+=(todayMonth-dateMonth)*28;
            diff+=(todayDate-dateDate);

            if(map.get(t) <= diff) list.add(i+1);

        }

        return list;
    }
}
