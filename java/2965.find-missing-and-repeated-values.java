class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int[] count = new int[n * n];
        for (int[] r : grid) {
            for (int c : r) {
                count[c - 1]++;
            }
        }
        int[] res = new int[2];
        for (int i = 0; i < n * n; i++) {
            if (count[i] == 2) {
                res[0] = i + 1;
            } else if (count[i] == 0) {
                res[1] = i + 1;
            }
        }
        return res;

    }
}
