class Solution {
    public int findClosest(int x, int y, int z) {

        //int dist1 = Math.abs(z - x);
        //int dist2 = Math.abs(z - y);

        // Another way without using inbuilt function

        int dist1 = z - x;
        int dist2 = z - y;

       // making positive answer without using inbuilt function

       dist1 =  dist1 < 0 ? -dist1 : dist1;
       dist2 =  dist2 < 0 ? -dist2 : dist2;

       return dist1 < dist2 ? 1 : dist1 > dist2 ? 2 : 0;
        
    }
}