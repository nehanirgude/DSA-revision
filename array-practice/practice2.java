import java.util.*;

public class practice2 {

    // function for printing
    // Input: arr[] = [12, 35, 1, 10, 34, 1]
    // Output: 34
    // Explanation: The largest element of the array is 35 and the second largest
    // element is 34.

    public static int secondLargest(int arr[]) {

        // first sort the array using bubblesort
        // aproach one
        // for (int turn = 0; turn < arr.length - 1; turn++) {
        // for (int j = 0; j < arr.length - turn - 1; j++) {
        // if (arr[j] > arr[j + 1]) {
        // int temp = arr[j];
        // arr[j] = arr[j + 1];
        // arr[j + 1] = temp;

        // }

        // }
        // }
        // return-1;

        // // now we get sorted array
        // System.out.println(arr[arr.length - 2]);

        // approach2

        // sorting
        Arrays.sort(arr);

        for (int i = arr.length - 2; i >= 0; i--) {

            if (arr[i] != arr[arr.length - 1]) {
                return arr[i];
            }

        }
        return -1;

    }
    // program for third largest element
    /*
     * Input: arr[] = {1, 14, 2, 16, 10, 20}
     * Output: The third Largest element is 14
     * 
     * Explanation: Largest element is 20, second largest element is 16
     * and third largest element is 14
     */

    public static int thirdLargest(int arr[]) {

        Arrays.sort(arr);

        // after sorting
        // since all elements are distict no need to chech arr[i]!=arr[arr.length-1]

        return arr[arr.length - 3];

    }

    // maximum triplets product
    /*
     * nput: [10, 3, 5, 6, 20]
     * Output: 1200
     * Explanation: Multiplication of 10, 6 and 20
     */

    public static int maxTripletProd(int arr[]) {
        int maxProd = 0;

        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    int currProd = arr[i] * arr[j] * arr[k];
                    maxProd = Math.max(maxProd, currProd);

                }
            }
        }
        return maxProd;

    }

    /*
     * Given an array of integers arr[], the task is to move all the zeros to the
     * end of the array while maintaining the relative order of all non-zero
     * elements.
     * 
     * Examples:
     * 
     * Input: arr[] = [1, 2, 0, 4, 3, 0, 5, 0]
     * Output: arr[] = [1, 2, 4, 3, 5, 0, 0, 0]
     * Explanation: There are three 0s that are moved to the end
     */

    public static void moveNonZerosToEnd(int arr[]) {

        int temp[] = new int[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                temp[j++] = arr[i];
            }
        }

        // remaining elements

        while (j < arr.length) {
            temp[j++] = 0;

        }

        // copy all elements from temp to array

        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];

        }
    } /*
       * given an array arr[] and an integer K, the task is to reverse every subarray
       * formed by consecutive K elements.
       * 
       * Examples:
       * 
       * Input: arr[] = [1, 2, 3, 4, 5, 6, 7, 8, 9], K = 3
       * Output: 3, 2, 1, 6, 5, 4, 9, 8, 7
       */

    public static void reverseSubArr(int arr[], int k) {
        int n = arr.length;
        for (int i = 0; i < arr.length; i += k) {
            int left = i;

            int right = Math.min(i + k - 1, n - 1); // this will return minimum btn this two and it will be my rigth
                                                    // boundry
            int temp = 0;
            while (left < right) {
                temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }

        }

    }

    public static void main(String args[]) {
        // int arr[] = { 12, 35, 1, 10, 34, 1 };
        // int att[] = { 1, 14, 2, 16, 10, 20 };
        // secondLargest(arr);
        // System.out.println(secondLargest(arr));
        // System.out.println(thirdLargest(att));

        // int arr[] = { 10, 3, 5, 6, 20 };
        // System.out.println(maxTripletProd(arr));

        // int arr[] = { 1, 2, 0, 4, 3, 0, 5, 0 };

        // moveNonZerosToEnd(arr);
        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i]);
        // }

        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int k = 3;
        reverseSubArr(arr, k);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}
