class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int[] res = new int[2];
        for (int i = 0; i < mat.length; i++) {
            int ones = 0;
            for (int j = 0; j < mat[0].length; j++) {
                ones += mat[i][j];
            }
            if (ones > res[1]) {
                res[0] = i;
                res[1] = ones;
            }
        }
        return res;
    }
}
