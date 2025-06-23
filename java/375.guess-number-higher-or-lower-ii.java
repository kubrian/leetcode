class Solution {
    public int getMoneyAmount(int n) {
        // Let [i][j] denote min cost to guess in interval [i, j]
        // 1 <= i <= j <= n, [i, i] -> 0 cost.
        // Find best x to split [i, j] into [x, x] OR [i, x-1] OR [x+1, j]
        int[][] minCost = new int[n + 1][n + 1];
        // To fill [i][j], we need row x+1 > i and col x-1 < j to be filled
        // So go left to right and bottom to top
        for (int j = 1; j <= n; j++) {
            for (int i = j - 1; i >= 1; i--) {
                // Possible to be wrong
                minCost[i][j] = Integer.MAX_VALUE;
                for (int x = i; x <= j; x++) {
                    // Guess x + max cost of [i, x-1] and [x+1, j]
                    int lower = x - 1 < i ? 0 : minCost[i][x - 1];
                    int higher = x + 1 > j ? 0 : minCost[x + 1][j];
                    minCost[i][j] = Math.min(minCost[i][j], Math.max(lower, higher) + x);
                }
            }
        }
        return minCost[1][n];
    }
}
