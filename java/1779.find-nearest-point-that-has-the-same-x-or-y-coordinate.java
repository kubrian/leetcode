class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int minDist = Integer.MAX_VALUE;
        int minIdx = -1;
        for (int i = 0; i < points.length; i++) {
            int cx = points[i][0];
            int cy = points[i][1];
            if (cx == x || cy == y) {
                int dist = Math.abs(cx - x) + Math.abs(cy - y);
                if (dist < minDist) {
                    minDist = dist;
                    minIdx = i;
                }
            }
        }
        return minIdx;
    }
}
