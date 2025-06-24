class Solution {
    public double largestTriangleArea(int[][] points) {
        double res = 0;
        for (int i = 0; i < points.length - 2; i++) {
            int pi0 = points[i][0];
            int pi1 = points[i][1];
            for (int j = i + 1; j < points.length - 1; j++) {
                int pj0 = points[j][0];
                int pj1 = points[j][1];
                for (int k = j + 1; k < points.length; k++) {
                    int pk0 = points[k][0];
                    int pk1 = points[k][1];
                    // The magic formula
                    double area = 0.5
                            * Math.abs(pi0 * (pj1 - pk1) + pj0 * (pk1 - pi1) + pk0 * (pi1 - pj1));
                    res = Math.max(res, area);
                }
            }
        }
        return res;
    }
}
