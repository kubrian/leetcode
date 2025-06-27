class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        // Original
        for (int i = 0; i < 4; i++) {
            if (isSame(mat, target)) {
                return true;
            }
            mat = rotate(mat);
        }
        return false;
    }

    private boolean isSame(int[][] mat, int[][] target) {
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] != target[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    private int[][] rotate(int[][] mat) {
        int n = mat.length;
        int[][] res = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                res[j][n - i - 1] = mat[i][j];
            }
        }
        return res;
    }
}
