class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        for (int i = 2; i < coordinates.length; i++) {
            int[] p1 = coordinates[0];
            int[] p2 = coordinates[i - 1];
            int[] p3 = coordinates[i];
            int x1 = p2[0] - p1[0];
            int y1 = p2[1] - p1[1];
            int x2 = p3[0] - p1[0];
            int y2 = p3[1] - p1[1];
            if (x1 * y2 != x2 * y1) {
                return false;
            }
        }
        return true;
    }
}
