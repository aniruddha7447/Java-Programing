package Practice;
import java.util.ArrayList;

public class PairSum1 {
    public static void pairsum(ArrayList<Integer> list,int target) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if(list.get(i)+ list.get(j) == target) {
                	System.out.print("(" + list.get(i) + "," + list.get(j) + ") ");
                }
            }
        }
        
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target = 22;
        pairsum(list,target);
    }
}
