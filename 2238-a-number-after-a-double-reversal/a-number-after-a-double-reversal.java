class Solution {
    public boolean isSameAfterReversals(int num) {
        // if num is 0 then it is always true
         if(num == 0) {
           return true;
         }
        // if last digit contains 0 then their reverse will never equal to the original
         if(num % 10 == 0){
           return false;
         }
        
        // otherwise after two reversal all numbers will be same as original
        return true;   
        
    }
}