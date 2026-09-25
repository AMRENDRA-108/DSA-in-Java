class Solution {
    public int thirdMax(int[] nums) {
        
        long max = Long.MIN_VALUE;
        long Smax = Long.MIN_VALUE;
        long Tmax = Long.MIN_VALUE;

        for(int n : nums){
            if(n > max){
                Tmax = Smax;
                Smax = max;
                max = n;
            }

            else if( n > Smax && n < max){
               Tmax = Smax;
               Smax = n;
            }

            else if(n > Tmax && n < Smax && n < max){
                Tmax = n;
            }
        }

        if(Tmax == Long.MIN_VALUE){
            return (int)max;
        }

     return (int)Tmax;
    }
}