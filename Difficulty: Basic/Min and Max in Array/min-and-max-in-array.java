class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        int max = arr[0];
        int min = arr[0];
        
        int n = arr.length;
        
       ArrayList<Integer> index = new ArrayList<>();
        
        for(int i = 1; i < n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            
            if(arr[i] < min){
                min = arr[i];
            }
            
        }
        
        index.add(min);
        index.add(max);
        
        return index;
        
    }
}
