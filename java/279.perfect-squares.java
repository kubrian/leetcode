import java.util.Arrays;

class Solution {
    public int numSquares(int n) {
        int[] res = new int[n + 1];
        Arrays.fill(res, Integer.MAX_VALUE);
        res[0] = 0;
        for (int i = 0; i <= n; i++) {
            int j = 1;
            while (i - j * j >= 0) {
                res[i] = Math.min(res[i], res[i - j * j] + 1);
                j++;
            }
        }
        return res[n];
    }
}
