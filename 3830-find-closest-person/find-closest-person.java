class Solution {
    public int findClosest(int x, int y, int z) {

        int dist1 = Math.abs(z - x);
        int dist2 = Math.abs(z - y);

       return dist1 < dist2 ? 1 : dist1 > dist2 ? 2 : 0;
        
    }
}