

class Solution {
    public int minCandy(int[] arr) {
        int n = arr.length;
        if (n == 0) return 0;

        int[] candies = new int[n];

        // Step 1: Har child ko initial 1 candy diye
        Arrays.fill(candies, 1);

        // Step 2: Left to Right Pass
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                candies[i] = candies[i - 1] + 1;
            }
        }

        // Step 3: Right to Left Pass
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > arr[i + 1]) {
                candies[i] = Math.max(candies[i], candies[i + 1] + 1);
            }
        }

        // Step 4: Total sum 
        int totalCandies = 0;
        for (int c : candies) {
            totalCandies += c;
        }

        return totalCandies;
    }
}