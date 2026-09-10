class Solution {
    public boolean isPalindrome(int x) {
        
        int num = x;
        int rev = 0;

        while(x > 0){
            int digit = x % 10;
            rev = 10 * rev + digit;
            x /= 10;
        }

        // here if num == rev then num is palindrome and it returns true
        return num == rev;
    }
}