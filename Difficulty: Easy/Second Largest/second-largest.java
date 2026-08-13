class Solution {
    public int getSecondLargest(int[] arr) {
        int n = arr.length;
        int max = arr[0];

        // Step 1: Largest element (max) find kar rahe hain
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        int secondMax = -1; // Second largest initialize kar rahe hain

       
        for (int i = 0; i < n; i++) {
            if (arr[i] != max && arr[i] > secondMax) {
                secondMax = arr[i];
            }
        }

        return secondMax; // Agar koi second largest nahi mila toh -1 hi return hoga
    }
}