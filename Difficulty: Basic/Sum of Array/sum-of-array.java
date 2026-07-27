class Solution {
    public int arraySum(int arr[]) {
        // code here
        int sum = 0;
        
        for(int left = 0; left <= arr.length - 1; left++){
            sum += arr[left];
        }
        
        return sum;
    }
}
