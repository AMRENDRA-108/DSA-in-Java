class Solution {
    public int[] shuffle(int[] nums, int n) {

        int[] ans = new int[2*n];
        

        for(int i = 0 ; i < n; i++ ){

            // if  n= 3, yhan array ka length 6 hai but ham for loop n = 2 tak hi run krange 
            // kyonki i = 3 pe ya 3 se bra no pe ans[2*3] = ans[6] - 6 is wrong index
            ans[ 2*i] = nums[i];
            ans[2*i+1] = nums[i + n];
        }
        

        return ans;
        
    }
}