class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] paths = new int[m][n];
        paths[0][0] = 1 - obstacleGrid[0][0];

        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                if (obstacleGrid[r][c] == 1) {
                    continue;
                }
                if (r - 1 >= 0) {
                    paths[r][c] += paths[r - 1][c];
                }
                if (c - 1 >= 0) {
                    paths[r][c] += paths[r][c - 1];
                }
            }
        }

        return paths[m - 1][n - 1];
    }
}
