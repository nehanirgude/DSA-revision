public class practice {

    public double median(int nums1[], int nums2[]) {
        int n = nums1.length;
        int m = nums2.length;
        int mergedArr[] = new int[n + m];

        int i = 0;
        int j = 0;
        int k = 0;
        
        while (i < n && j < m) {
            if (nums1[i] < nums2[j]) {
                mergedArr[k] = nums1[i];
                i++;

            } else {
                mergedArr[k] = nums2[j];
                j++;

            }
            k++;

        }

        // reamining elements leftover in nums1
        while (i < n) {
            mergedArr[k++] = nums1[i++];
        }
        while (j < m) { // leftover elements of nums2
            mergedArr[k++] = nums1[j++];
        }

        int totalLength = n + m;

        if (totalLength % 2 == 1) {
            // length is odd
            return mergedArr[totalLength / 2];
        } else {
            return (mergedArr[totalLength / 2 - 1] + mergedArr[totalLength / 2]) / 2.0;

        }

    }

    public static void triplets(int arr[]) {
        int n = arr.length;
        // brute force approach
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        System.out.println("[" + arr[i] + "," + arr[j] + "," + arr[k] + "]");
                    }

                }
            }
        }

    }

    public static void main(String args[]) {
        // practice p = new practice();
        // int nums1[] = { 1, 2 };
        // int nums[] = { 3, 4 };

        // double median = p.median(nums1, nums);
        // System.out.println(median);

        int arr[] = { 0, 1, 1 };
        triplets(arr);

    }

}
