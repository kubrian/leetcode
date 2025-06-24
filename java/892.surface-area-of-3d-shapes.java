class Solution {
    public int surfaceArea(int[][] grid) {
        // Sum up by height then subtract overlap
        int res = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] > 0) {
                    res += 2; // top and bottom
                    res += grid[i][j] * 4; // sides
                    // Overlap with above and left
                    if (i - 1 >= 0 && grid[i - 1][j] > 0) {
                        res -= Math.min(grid[i][j], grid[i - 1][j]) * 2;
                    }
                    if (j - 1 >= 0 && grid[i][j - 1] > 0) {
                        res -= Math.min(grid[i][j], grid[i][j - 1]) * 2;
                    }
                }
            }
        }
        return res;
    }
}
