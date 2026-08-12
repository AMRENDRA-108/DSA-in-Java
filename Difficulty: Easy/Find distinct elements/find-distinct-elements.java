class Solution {
    static int distinct(int arr[], int n) {
        // code here
        HashSet<Integer> set = new HashSet<>();
        
        for(int element : arr){
            set.add(element);
        }
        return set.size();
        
    }
}