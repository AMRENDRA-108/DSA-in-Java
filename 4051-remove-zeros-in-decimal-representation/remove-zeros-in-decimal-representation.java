class Solution {
    public long removeZeros(long n) {
        long reverse=0;
        long rev2=0;
       
        while (n != 0) {
            long digit = n% 10;
            if(digit!=0)
            reverse = reverse * 10 + digit;
            n = n/ 10;
        }
        while(reverse!=0)
        {
            long digit = reverse% 10;
            rev2 = rev2* 10 + digit;
            reverse=reverse/10;
        }
        return rev2;
    }
}