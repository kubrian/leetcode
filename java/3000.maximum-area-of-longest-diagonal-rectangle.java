class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        double maxDiagonal = 0;
        int maxArea = 0;
        for (int[] dim : dimensions) {
            double diag = Math.sqrt(dim[0] * dim[0] + dim[1] * dim[1]);
            if (diag > maxDiagonal) {
                maxDiagonal = diag;
                maxArea = dim[0] * dim[1];
            } else if (diag == maxDiagonal) {
                maxArea = Math.max(maxArea, dim[0] * dim[1]);
            }
        }
        return maxArea;
    }
}
