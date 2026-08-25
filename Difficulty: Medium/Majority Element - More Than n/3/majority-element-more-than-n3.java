class Solution {
    public ArrayList<Integer> findMajority(int[] arr) {
        // code here
        int n = arr.length;
        
        Integer cand1 = null, cand2 = null;
        int count1 = 0, count2 = 0;
        
        for(int num : arr){
            
            if(cand1 != null && cand1 == num){
                count1++;
            }
            
            else if(cand2 != null && cand2 == num){
                count2++;
            }
            
            else if(count1 == 0){
                cand1 = num;
                count1 = 1;
            }
            
            else if(count2 == 0){
                cand2 = num;
                count2 = 1;
            }
            
            else{
                count1--;
                count2--;
            }
        }
        
        int freq1 = 0, freq2 = 0;
        
        for(int num : arr){
            if(cand1 != null && num == cand1){
                freq1++;
            }
            else if (cand2 != null && num == cand2){
                freq2++;
            }
        }
        
        
        ArrayList<Integer> result = new ArrayList<>();
        
        if(freq1 > n/3){
            result.add(cand1);
        }
        
        if(freq2 > n/3){
            result.add(cand2);
        }
        
        Collections.sort(result);
        
        return result;
        
        
        
    }
}