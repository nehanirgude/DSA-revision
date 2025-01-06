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

    public static void main(String args[]) {
        // int arr[] = { 12, 35, 1, 10, 34, 1 };
        // int att[] = { 1, 14, 2, 16, 10, 20 };
        // secondLargest(arr);
        // System.out.println(secondLargest(arr));
        // System.out.println(thirdLargest(att));

        int arr[] = { 10, 3, 5, 6, 20 };
        System.out.println(maxTripletProd(arr));

    }

}
