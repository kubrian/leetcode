class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        // Intialize
        int[][] minPath = new int[m][n];
        minPath[0][0] = grid[0][0];

        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                if (r == 0 && c == 0) {
                    continue;
                }
                int p1 = Integer.MAX_VALUE;
                int p2 = Integer.MAX_VALUE;
                if (r - 1 >= 0) {
                    p1 = minPath[r - 1][c];
                }
                if (c - 1 >= 0) {
                    p2 = minPath[r][c - 1];
                }
                minPath[r][c] = Math.min(p1, p2) + grid[r][c];
            }
        }

        return minPath[m - 1][n - 1];
    }
}
