class Solution {
    public int[] findColumnWidth(int[][] grid) {
        int[] res = new int[grid[0].length];
        for (int i = 0; i < grid[0].length; i++) {
            for (int j = 0; j < grid.length; j++) {
                res[i] = Math.max(res[i], digits(grid[j][i]));
            }
        }
        return res;
    }

    private int digits(int num) {
        int res = 0;
        if (num <= 0) {
            res++;
            num = -num;
        }
        while (num > 0) {
            num /= 10;
            res++;
        }
        return res;
    }
}
