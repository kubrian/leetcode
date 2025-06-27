class Solution {
    public boolean checkValid(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            // rows
            boolean[] seen = new boolean[n];
            for (int j = 0; j < n; j++) {
                int num = matrix[i][j];
                if (seen[num - 1]) {
                    return false;
                }
                seen[num - 1] = true;
            }

            // columns
            seen = new boolean[n];
            for (int j = 0; j < n; j++) {
                int num = matrix[j][i];
                if (seen[num - 1]) {
                    return false;
                }
                seen[num - 1] = true;
            }
        }
        return true;
    }
}
