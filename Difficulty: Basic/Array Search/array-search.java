class Solution {
    public int search(int arr[], int x) {
        // code here
         
         
        
        for(int left = 0; left <= arr.length -1; left++){
            if(arr[left] == x){
              return left;
            }
           
        }
        return -1 ;
    }
}
