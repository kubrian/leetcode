class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        // play with min and max?
        int dx = Math.max(Math.min(ax2, bx2) - Math.max(ax1, bx1), 0); // 0 for non-overlap
        int dy = Math.max(Math.min(ay2, by2) - Math.max(ay1, by1), 0); // 0 for non-overlap
        int overlap = dx * dy;
        int areaA = (ax2 - ax1) * (ay2 - ay1);
        int areaB = (bx2 - bx1) * (by2 - by1);
        int res = areaA + areaB - overlap;
        return res;
    }
}
