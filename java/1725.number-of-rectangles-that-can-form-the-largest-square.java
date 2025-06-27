class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        int maxLen = 0;
        for (int[] rect : rectangles) {
            maxLen = Math.max(maxLen, Math.min(rect[0], rect[1]));
        }
        int count = 0;
        for (int[] rect : rectangles) {
            if (rect[0] >= maxLen && rect[1] >= maxLen) {
                count++;
            }
        }
        return count;
    }
}
