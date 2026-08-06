class Solution {
    public int largestAltitude(int[] gain) {

        int CurrentAltitude = 0;
        int HighestAltitude = 0;

        int n = gain.length;

        for(int i = 0; i < n; i++){

            CurrentAltitude += gain[i];

            if(CurrentAltitude > HighestAltitude){

            HighestAltitude = CurrentAltitude;
        }

        }

        

        return HighestAltitude;
        
    }
}