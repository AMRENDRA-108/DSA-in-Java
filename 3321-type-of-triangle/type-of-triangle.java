class Solution {
    public String triangleType(int[] nums) {
       // [5,3,4]
       Arrays.sort(nums);
       // [3,4,5]
       if(nums[0] + nums[1] <= nums[2]){
        return "none";
       }

       else if(nums[0] == nums[1] && nums[1] == nums[2]){
        return "equilateral";
       }

       else if(nums[0] == nums[1] || nums[1] == nums[2]){
         return "isosceles";
       }

       else{
          return "scalene";
       }
    }
}