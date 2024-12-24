import java.util.*;

public class PairSum1 {

    public static boolean pairSum1(ArrayList<Integer> list, int target) {

        for (int i = 1; i < list.size(); i++) {

            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) + list.get(j) == target) {
                    return true;
                }

            }
        }
        return false;
    }

    public static void main(String args[]) {
        // we have this arraylist list=[1,2,3,4,5,6]
        // and i have target=5 and target means i want to find the pair in arraylist
        // in which it have sum=5

        ArrayList<Integer> list = new ArrayList<>();
        int target = 5;

        for (int i = 1; i <= 5; i++) {
            list.add(i);
        }
        System.out.println(list);

        System.out.println(pairSum1(list, target));

    }

}