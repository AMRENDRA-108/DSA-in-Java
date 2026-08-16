class Solution {
    public ArrayList<Integer> checkDoorStatus(int n) {
        // code here
        
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            
            int root = (int) Math.sqrt(i);
            
            if(root*root == i){
                result.add(1);
            }
            
            else{
                result.add(0);
            }
            
        }
        
        return result;
            
        
    }
}