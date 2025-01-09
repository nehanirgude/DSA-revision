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

    public static String reverseWords(String str) {
        // Split the string by dots, ignoring empty parts caused by multiple dots
        String[] words = str.split("\\.+");

        // Create a StringBuilder to construct the result
        StringBuilder result = new StringBuilder();

        // Iterate over the words array in reverse order
        for (int i = words.length - 1; i >= 0; i--) {
            // Add the word to the result
            result.append(words[i]);

            // Append a dot after the word, if it's not the last word
            if (i > 0) {
                result.append(".");
            }
        }

        // Handle leading/trailing dots:
        // If the original string starts or ends with dots, add them accordingly
        if (str.startsWith(".")) {
            result.insert(0, ".");
        }
        if (str.endsWith(".")) {
            result.append(".");
        }

        return result.toString();
    }

    // longest common prefix
    // Input: arr[] = [“geeksforgeeks”, “geeks”, “geek”, “geezer”]
    // Output: “gee”

    public static String longestCommonPref(String arr[]) {

        Arrays.sort(arr);
        String first = arr[0];
        String last = arr[arr.length - 1];
        int minLength = Math.min(first.length(), last.length());

        // find common prefix between first and last
        int i = 0;
        while (i < minLength && first.charAt(i) == last.charAt(i)) {

            i++;

        }

        return first.substring(0, i);

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
        // String str = "i.like.this.program.very.much";
        // System.out.println(reverseWords(str));

        // 5
        String arr[] = { "geeksforgeeks", "geeks", "geek", "geezer" };
        System.out.println(longestCommonPref(arr));

    }

}
