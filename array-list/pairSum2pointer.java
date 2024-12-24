import java.util.*;

public class pairSum2pointer {

    // program to find sum of twopairs by using two pointer approach
    public static boolean twoPointer(ArrayList<Integer> list, int target) {

        int lp = 0;
        int rp = list.size() - 1;
        while (lp != rp) {
            if (list.get(lp) + list.get(rp) == target) {
                return true;

            }
            if (list.get(lp) + list.get(rp) < target) {
                lp++;

            } else {
                rp--;
            }

        }
        return false;
    }

    public static void main(String args[]) {

        ArrayList<Integer> list = new ArrayList<>();
        int target = 5;

        for (int i = 1; i <= 5; i++) {
            list.add(i);
        }
        System.out.println(list);

    }

}
