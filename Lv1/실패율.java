import java.util.*;
class Node{
    int stage;
    double fail;
    
    Node(int stage, double fail){
        this.stage=stage;
        this.fail=fail;
    }
    
}

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        HashMap<Integer, Integer> map=new HashMap<>();
        ArrayList<Node> list=new ArrayList<>();
        
        for(int i=0; i<stages.length; i++){
            map.put(stages[i], map.getOrDefault(stages[i], 0)+1);
        }
        
        int cnt=stages.length;
        for(int i=1; i<=N; i++){
            if(map.containsKey(i)){
                list.add(new Node(i, (double)map.get(i)/cnt));
                cnt-=map.get(i);
            }
            else list.add(new Node(i, 0));
        }
        
        Comparator<Node> comp=new Comparator<>(){
            @Override
            public int compare(Node o1, Node o2){
                if(o1.fail > o2.fail) return -1;
                else if(o1.fail==o2.fail) return o1.stage-o2.stage;
                else return 1;
            }
        };
        
        Collections.sort(list, comp);
        
        for(int i=0; i<list.size(); i++) answer[i]=list.get(i).stage;     
        
        return answer;
    }
}
