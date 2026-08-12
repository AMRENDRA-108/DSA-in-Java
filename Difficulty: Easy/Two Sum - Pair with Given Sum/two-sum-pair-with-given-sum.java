class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
        HashSet<Integer> set = new HashSet<>();
        
        for(int element:arr){
            
            int required = target - element;
            
            if(set.contains(required)){
                return true;
            }
            
            set.add(element);
        }
        
        return false;
    }
}