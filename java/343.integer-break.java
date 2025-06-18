class Solution {
    public int integerBreak(int n) {
        // Need to split 2 and 3
        if (n == 2) {
            return 1;
        }
        if (n == 3) {
            return 2;
        }

        // The subcase is that of multiplied numbers
        int[] res = new int[n + 1];
        res[2] = 2; // No need to split 2
        res[3] = 3; // No need to split 3
        for (int i = 4; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                res[i] = Math.max(res[i], res[i - j] * j);
            }
        }
        return res[n];
    }
}
