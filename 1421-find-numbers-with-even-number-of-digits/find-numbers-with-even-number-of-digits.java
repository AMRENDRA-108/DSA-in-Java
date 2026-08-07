class Solution {
    public int findNumbers(int[] nums) {

        int answer = 0;
        int n = nums.length;

        for(int i = 0; i < n; i++){

            int digit = 0;
            int num = nums[i];

            while(num != 0){
                num = num / 10;
                digit++;
            }

            if(digit % 2 == 0){
                answer++;
             }

            
        }

        return answer;
        
    }
}