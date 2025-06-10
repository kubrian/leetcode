class Solution {
    public int numTrees(int n) {
        int[] res = new int[n + 1];
        res[0] = 1;

        // Across tree size
        for (int i = 1; i <= n; i++) {
            // Across root choice
            for (int r = 1; r <= i; r++) {
                // There are r-1 nodes on the left and i-r nodes on the right
                // Every pair is a valid combination
                res[i] += res[r - 1] * res[i - r];
            }
        }

        return res[n];
    }
}
