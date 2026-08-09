class Solution {
    public int[] twoSum(int[] nums, int target) {

        int[] indices = new int[2];
        int n = nums.length;
        
        for(int i = 0; i < n; i++){
            for(int j = i +1; j < n; j++){

                if(nums[i] + nums[j] == target){

                    indices[0] = i;
                    indices[1] = j;
                }
            }
        }

        return indices;
    }
}