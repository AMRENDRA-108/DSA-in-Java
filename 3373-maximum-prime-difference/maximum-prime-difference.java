class Solution {
    public int maximumPrimeDifference(int[] nums) {
        int startIndex = 0;
        int endIndex = 0;

        for(int i = 0; i < nums.length; i++){
            if(chekPrime(nums[i])){
               startIndex = i;
               break;
            }
        }

        for(int i = nums.length - 1  ; i >= 0 ; i--){
            if(chekPrime(nums[i])){
                endIndex = i;
                break;
            }
        }

        return endIndex - startIndex;     
    }



     public static boolean chekPrime(int n){
               if(n < 2)  return false;
           
               for(int i = 2; i*i <= n; i++){
                    if(n%i == 0){
                     return false;
                  }
               }

             return true;
        }
}