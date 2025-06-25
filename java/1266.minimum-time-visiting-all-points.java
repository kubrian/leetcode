class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int[] currpt = points[0];
        int res = 0;
        for (int i = 1; i < points.length; i++) {
            res += Math.max(Math.abs(currpt[0] - points[i][0]), Math.abs(currpt[1] - points[i][1]));
            currpt = points[i];
        }
        return res;
    }
}
