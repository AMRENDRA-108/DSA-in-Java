class Solution {
    public int maximumWealth(int[][] accounts) {

        int maxWealth = 0;
        

        int n = accounts.length;  // no. of element in row
        int m = accounts[0].length;  // no. of element in first row- which gives no. of column

        for(int i = 0; i < n ; i++){

            int currentWealth = 0;

            for(int j = 0; j < m; j++){
                  currentWealth += accounts[i][j];
                 }

                if(currentWealth > maxWealth){
                    
                    maxWealth = currentWealth;
                

            }
        }

        return maxWealth;

        
        
    }
}