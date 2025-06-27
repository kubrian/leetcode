class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        boolean[] covered = new boolean[right - left + 1];
        for (int[] range : ranges) {
            for (int i = range[0]; i <= range[1]; i++) {
                if (i >= left && i <= right) {
                    covered[i - left] = true;
                }
            }
        }
        for (int i = 0; i < covered.length; i++) {
            if (!covered[i]) {
                return false;
            }
        }
        return true;
    }
}
