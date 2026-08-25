class Solution {
    static int extractMaximum(String s) {
        // code here
        int maxVal = -1;
        int currVal = 0;
        boolean foundDigit = false;
        
        for(int i = 0; i < s.length(); i++){
            
            char ch = s.charAt(i);
            
            if(Character.isDigit(ch)){
                
                foundDigit = true;
                currVal = currVal*10 + (ch - '0');
            }
            
            else{
                if(foundDigit){
                    maxVal = Math.max(maxVal, currVal);
                    currVal = 0;
                }
            }
            
        }
        
        if(foundDigit) {
                maxVal = Math.max(maxVal, currVal);
            }
            
            return maxVal;
    }
}
