import java.util.HashSet;

class Solution {
    public boolean subArrayExists(int arr[]) {
        HashSet<Integer> set = new HashSet<>();
        int currentSum = 0;

        for (int num : arr) {
            currentSum += num;

            // Condition 1: Direct sum 0, element 0, ya prefix sum repeat hona
            if (currentSum == 0 || num == 0 || set.contains(currentSum)) {
                return true;
            }

            // Current prefix sum ko set me add karo
            set.add(currentSum);
        }

        return false;
    }
}