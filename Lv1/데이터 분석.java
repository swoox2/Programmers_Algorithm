import java.util.*;
class Node{
    int code, date, max, remain;
    
    Node(int code, int date, int max, int remain){
        this.code=code;
        this.date=date;
        this.max=max;
        this.remain=remain;
    }
}

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        ArrayList<Node> list=new ArrayList<>();
        
        for(int i=0; i<data.length; i++){
            switch(ext){
                case "code":
                    if(val_ext > data[i][0]) list.add(new Node(data[i][0], data[i][1], data[i][2], data[i][3]));
                    break;
                case "date":
                    if(val_ext > data[i][1]) list.add(new Node(data[i][0], data[i][1], data[i][2], data[i][3]));
                    break;
                case "maximum":
                    if(val_ext > data[i][2]) list.add(new Node(data[i][0], data[i][1], data[i][2], data[i][3]));
                    break;
                case "remain":
                    if(val_ext > data[i][3]) list.add(new Node(data[i][0], data[i][1], data[i][2], data[i][3]));
                    break;
            }
        }
        
        Collections.sort(list, (o1, o2) -> {
            if(sort_by.equals("code")) return o1.code-o2.code;
            else if(sort_by.equals("date")) return o1.date-o2.date;
            else if(sort_by.equals("maximum")) return o1.max-o2.max;
            else return o1.remain-o2.remain;
        });
        
        int[][] answer = new int[list.size()][4];
        
        for(int i=0; i<list.size(); i++){
            Node n=list.get(i);
            
            answer[i][0]=n.code;
            answer[i][1]=n.date;
            answer[i][2]=n.max;
            answer[i][3]=n.remain;
        }
        
        return answer;
    }
}
