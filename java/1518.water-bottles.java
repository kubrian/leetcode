class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int res = 0;
        while (numBottles >= numExchange) {
            int currDrink = numBottles - numBottles % numExchange;
            int newBottles = currDrink / numExchange;
            res += currDrink;
            numBottles = numBottles - currDrink + newBottles;
        }
        return res + numBottles;
    }
}
