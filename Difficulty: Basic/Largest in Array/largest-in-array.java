class Solution {
    public static int largest(int[] arr) {
        // code here
        int max = arr[0];
        
        for(int left = 1; left <= arr.length - 1; left++){
            if(arr[left] > max){
                max = arr[left];
            }
        }
        
        return max;
    }
}
