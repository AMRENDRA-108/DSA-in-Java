class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        

        int bottle = numBottles;
        int sum = 0;

        while( bottle >= numExchange){

            int exchange = bottle / numExchange;
            int rest = bottle % numExchange;

            sum = sum + exchange;

            bottle = exchange + rest;

        }

        return numBottles + sum;
    }
}