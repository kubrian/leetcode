class Solution {
    public int minimumOperations(int[][] grid) {
        int res = 0;
        for (int j = 0; j < grid[0].length; j++) {
            for (int i = 1; i < grid.length; i++) {
                if (grid[i][j] <= grid[i - 1][j]) {
                    res += grid[i - 1][j] - grid[i][j] + 1;
                    grid[i][j] = grid[i - 1][j] + 1;
                }
            }
        }
        return res;
    }
}
