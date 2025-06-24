class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        // The top left is always incremented, so it is the most frequent.
        // Cut the rectange with every op.
        for (int[] op : ops) {
            m = Math.min(m, op[0]);
            n = Math.min(n, op[1]);
        }
        return m * n;
    }
}
