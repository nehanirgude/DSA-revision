import java.util.*;

public class practice2 {

    // function for printing
    // Input: arr[] = [12, 35, 1, 10, 34, 1]
    // Output: 34
    // Explanation: The largest element of the array is 35 and the second largest
    // element is 34.

    public static void secondLargest(int arr[]) {

        // first sort the array using bubblesort
        for (int turn = 0; turn < arr.length - 1; turn++) {
            for (int j = 0; j < arr.length - turn - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }

            }
        }

        // now we get sorted array
        System.out.println(arr[arr.length - 2]);

    }

    public static void main(String args[]) {
        int arr[] = { 12, 35, 1, 10, 34, 1 };
        secondLargest(arr);

    }

}
