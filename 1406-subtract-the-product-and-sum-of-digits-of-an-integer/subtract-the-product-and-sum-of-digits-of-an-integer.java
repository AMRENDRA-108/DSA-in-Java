class Solution {
    public int subtractProductAndSum(int n) {

        int digitSum = 0; 
        int digitMul = 1;
        
        while(n > 0){
            int digit = n % 10;

            digitSum += digit;

            digitMul *= digit;

            n/=10;

        }

        return digitMul - digitSum;

        
    }
}