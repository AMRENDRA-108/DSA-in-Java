class Solution {
    public int removeDuplicates(int[] nums) {

        if(nums.length == 0){
            return 0;
        }

        int max = nums[0];
        int min = nums[0];

        for(int n : nums){
            if(n > max){
                max = n;
            }
            else if(n < min){
                min = n;
            }
        }

        int[] freq = new int[max-min + 1];

        for(int n : nums){
            freq[n - min]++;
        }

        int index = 0;

        for(int i = 0; i < freq.length; i++){
            if(freq[i] > 0){
                nums[index++] = i + min;
            }
        }
        return index;
    }
}