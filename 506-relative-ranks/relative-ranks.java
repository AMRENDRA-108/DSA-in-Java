import java.util.Arrays;

class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        // Create a 2D array to store {score, original_index}
        int[][] scoreIndex = new int[n][2];
        for (int i = 0; i < n; i++) {
            scoreIndex[i][0] = score[i];
            scoreIndex[i][1] = i;
        }
        
        // Sort in descending order based on the scores
        Arrays.sort(scoreIndex, (a, b) -> Integer.compare(b[0], a[0]));
        
        String[] result = new String[n];
        
        for (int i = 0; i < n; i++) {
            int originalIndex = scoreIndex[i][1];
            if (i == 0) {
                result[originalIndex] = "Gold Medal";
            } else if (i == 1) {
                result[originalIndex] = "Silver Medal";
            } else if (i == 2) {
                result[originalIndex] = "Bronze Medal";
            } else {
                result[originalIndex] = String.valueOf(i + 1);
            }
        }
        
        return result;
    }
}