class Solution {
    public boolean checkDivisibility(int n) {
        int num = n;
        //int digit = 0;
        int sum = 0;
        int product = 1;

        while(n > 0){
            int digit = n  % 10;
            sum += digit;
            product *= digit;

            n = n / 10;
        }

        //return (num == sum + product);  error in some test case like input 10;

        return num % (sum + product ) == 0;

    }
}