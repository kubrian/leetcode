class Solution {
    public int arrangeCoins(int n) {
        // Highest k such that k*(k+1)/2 <= n
        // k^2 + k - 2n = 0
        // (k + 0.5)^2 = 2n + 0.25
        return (int) (Math.sqrt((long) 2 * n + 0.25) - 0.5);
    }
}
