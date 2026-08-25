class Solution {
    public int maxConsecBits(int[] arr) {
        
        if(arr.length == 0) return 0;
        
        int maxCount = 1;
        int currentCount = 1;


        for(int i = 0; i < arr.length - 1; i++) {

            if(arr[i] == arr[i + 1]) {
                currentCount++;
            }
            
            else{
                currentCount = 1;
            }
            
            maxCount = Math.max(maxCount, currentCount);
        }

        return maxCount;
    }
}