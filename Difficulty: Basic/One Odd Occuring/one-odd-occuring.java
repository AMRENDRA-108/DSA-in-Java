class Solution {
    int getOddOccurrence(int[] arr) {
        int res = 0;
        for (int num : arr) {
            res ^= num; // XOR each element
        }
        return res;
    }
}