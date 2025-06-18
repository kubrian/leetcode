class Solution {
    public int maxProfit(int[] prices) {
        // Just track max of every possible state, store it for next day and repeat
        int canBuy = 0;
        int canSell = -prices[0];
        int cooldown = 0;

        for (int i = 1; i < prices.length; i++) {
            int currCanBuy = Math.max(canSell, cooldown - prices[i]);
            int currCanSell = Math.max(canBuy, canSell + prices[i]);
            int currCooldown = Math.max(cooldown, canBuy);
            canSell = currCanBuy;
            canBuy = currCanSell;
            cooldown = currCooldown;
        }
       return Math.max(canBuy, cooldown);
    }
}
