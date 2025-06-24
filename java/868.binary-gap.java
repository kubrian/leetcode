class Solution {
    public int binaryGap(int n) {
        // Go to first 1 (from the back)
        while ((n & 1) == 0 && n != 0) {
            n >>= 1;
        }
        if (n == 0) {
            return 0;
        }
        int res = 0;
        int curr = 0;
        // Iterate and keep maxing
        while (n != 0) {
            if ((n & 1) == 1) {
                res = Math.max(res, curr);
                curr = 1;
            } else {
                curr++;
            }
            n >>= 1;
        }
        return res;
    }
}
