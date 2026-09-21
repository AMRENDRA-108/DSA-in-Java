class Solution {
    public int differenceOfSum(int[] nums) {

        int ElementSum = 0;
        int DigitSum = 0;
        
        for(int i = 0; i < nums.length; i++){
            ElementSum += nums[i];
        }

        for(int i = 0; i < nums.length; i++){
            while(nums[i] > 0){
                int digit = nums[i] % 10;
                DigitSum += digit;
                nums[i] /= 10;
            }
        }

        return ElementSum - DigitSum;
    }
}