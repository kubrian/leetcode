class Solution {
    public int findChampion(int[][] grid) {
        // find row with max sum
        int maxRow = 0;
        int max = 0;
        for (int i = 0; i < grid.length; i++) {
            int sum = 0;
            for (int j = 0; j < grid[0].length; j++) {
                sum += grid[i][j];
            }
            if (sum > max) {
                max = sum;
                maxRow = i;
            }
        }
        return maxRow;
    }
}
