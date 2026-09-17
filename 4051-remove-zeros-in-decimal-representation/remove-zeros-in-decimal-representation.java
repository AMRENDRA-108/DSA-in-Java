class Solution {
    public long removeZeros(long n) {
        
        long rev = 0;

        while(n > 0){

            long digit = n % 10;
            if(digit == 0){
                n = n / 10;
                continue;
            }

            else{
                rev = 10 * rev + digit;
                n = n / 10;
            }
        }

        long rev2 = 0;

        while(rev > 0){

            long digit = rev % 10;

           rev2 = 10* rev2 + digit;

            rev = rev / 10;


        }

        return rev2;
    }
}