class Solution {
    public int mirrorDistance(int n) {
        
        int rev = 0;
        int num = n;
        
  // mirror differrence
        while(n > 0){
            int digit = n % 10;
            rev = 10*rev + digit;
            n /= 10;
        }

        int dif = num - rev;
      // to return abs value of diff we use ternary operator
        return dif > 0 ? dif : -dif;
    }
}