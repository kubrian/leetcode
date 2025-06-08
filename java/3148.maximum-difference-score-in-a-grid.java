import java.util.List;

class Solution {
    public int maxScore(List<List<Integer>> grid) {
        int m = grid.size();
        int n = grid.get(0).size();
        int[][] dp = new int[m][n];
        int maxScore = Integer.MIN_VALUE;
        for (int r = m - 1; r >= 0; r--) {
            for (int c = n - 1; c >= 0; c--) {
                if (r == m - 1 && c == n - 1) {
                    dp[r][c] = 0;
                } else if (r == m - 1) {
                    int d = grid.get(r).get(c + 1) - grid.get(r).get(c);
                    dp[r][c] = Math.max(d, d + dp[r][c + 1]);
                    maxScore = Math.max(maxScore, dp[r][c]);
                } else if (c == n - 1) {
                    int d = grid.get(r + 1).get(c) - grid.get(r).get(c);
                    dp[r][c] = Math.max(d, d + dp[r + 1][c]);
                    maxScore = Math.max(maxScore, dp[r][c]);
                } else {
                    int d1 = grid.get(r).get(c + 1) - grid.get(r).get(c);
                    int d2 = grid.get(r + 1).get(c) - grid.get(r).get(c);
                    dp[r][c] = Math.max(d1,
                            Math.max(d2, Math.max(d1 + dp[r][c + 1], d2 + dp[r + 1][c])));
                    maxScore = Math.max(maxScore, dp[r][c]);
                }
            }
        }
        return maxScore;
    }
}
