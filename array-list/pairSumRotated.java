import java.util.*;

public class pairSumRotated {
    public static boolean pairSum(ArrayList<Integer> list, int target) {

        // bp=breaking point ot pivote point
        int bp = -1;
        int n = list.size();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > list.get(i + 1)) {
                bp = i;
                break;
            }
        }

        int lp = bp + 1; // smallest
        int rp = bp; // largets

        while (lp != rp) {
            // case one
            if (list.get(lp) + list.get(rp) == target) {
                return true;
            }
            // case 2
            if (list.get(lp) + list.get(rp) < target) {
                lp = (lp + 1) % n;
            }
            // case3
            if (list.get(lp) + list.get(rp) > target) {
                rp = (n + rp - 1) % n;
            }
        }
        return false;

    }

    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        int target = 16;

        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        System.out.println(pairSum(list, target));

    }

}
