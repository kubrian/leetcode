class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int best = 0;
        for (int i = 1; i < prices.length; i++) {
            best = Math.max(best, prices[i] - min); // If sold on day i against lowest before i.
            min = Math.min(min, prices[i]); // Update min
        }
        return best;
    }
}
