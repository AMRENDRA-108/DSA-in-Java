class Solution {

    public int[] getConcatenation(int[] nums) {

        // Step 1 : find the length of input array 
        int n = nums.length;

        // Step 2 : Create new array of size 2n

        int[] ans = new int[2*n];

        // Step 3 : travese the array using single loop
        for(int i = 0; i < n; i++){
            // Step 4  : assign nums value in ans array
            ans[i] = nums[i];
            ans[i+n] = nums[i];

       
        }

         // Step 5 : return ans array

         return ans;


    }

}