import java.util.*;

public class strpractice {

    // method to check wether the string is palindrom or not

    public static boolean strPalindrom(String str) {

        for (int i = 0; i < str.length() / 2; i++) {

            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }

        }
        return true;
    }
    // method for shortest path given string is WNEENESENNN;

    public static float shortestpath(String str) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'W') {
                x--;
            }
            if (str.charAt(i) == 'E') {
                x++;
            }
            if (str.charAt(i) == 'N') {
                y++;

            } else {
                y--;
            }

        }
        int X2 = x * x;
        int Y2 = y * y;
        return (float) Math.sqrt(X2 + Y2);
    }

    // method to convert string into uppercase
    public static String strUpperCase(String str) {

        StringBuilder sb = new StringBuilder(" ");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));

            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();

    }

    // Input: str = “i.like.this.program.very.much”
    // Output: str = “much.very.program.this.like.i”

    public static String reverseOrder(String str) {
        StringBuilder sb = new StringBuilder(" ");

        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == '.') {
                for (int j = i; j < str.length(); j++) {
                    sb.append(str.charAt(i));
                }
            }

        }
        return sb.toString();

    }

    public static void main(String args[]) {

        // String str = "noon";
        // System.out.println(strPalindrom(str));

        // 2
        // String str = "WNEENESENNN";
        // System.out.println(shortestpath(str));

        // 3
        // String str = "i am neha";
        // System.out.println(strUpperCase(str));

        // 4
        String str = "i.like.this.program.very.much";
        System.out.println(reverseOrder(str));

    }

}
