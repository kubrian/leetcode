import java.util.Arrays;

class Solution {
    public int coinChange(int[] coins, int amount) {
        // Graph might be faster to traverse less states
        
        if (amount == 0) {
            return 0;
        }

        int[] minCoins = new int[amount + 1];
        Arrays.fill(minCoins, amount + 1); // Impossible
        minCoins[0] = 0;

        for (int i = 1; i <= amount; i++) {
            for (int c : coins) {
                if (i - c >= 0) {
                    minCoins[i] = Math.min(minCoins[i], minCoins[i - c] + 1);
                }
            }
        }

        return minCoins[amount] == amount + 1 ? -1 : minCoins[amount];

    }
}
