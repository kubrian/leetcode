class Solution {
    public int maximalSquare(char[][] matrix) {
        int[][] res = new int[matrix.length][matrix[0].length];
        int max = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == '1') {
                    int corn = i == 0 || j == 0 ? 0 : res[i - 1][j - 1];
                    int left = j == 0 ? 0 : res[i][j - 1];
                    int top = i == 0 ? 0 : res[i - 1][j];
                    res[i][j] = Math.min(corn, Math.min(left, top)) + 1;
                    max = Math.max(max, res[i][j]);
                }
            }
        }
        return max * max;
    }
}
