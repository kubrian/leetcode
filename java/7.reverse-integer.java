class Solution {
    public int reverse(int x) {
        int res = 0;
        while (x != 0) {
            // Check for bounds
            if (Math.abs(res) > Integer.MAX_VALUE / 10) {
                return 0;
            }
            res = res * 10 + x % 10;
            x /= 10;
        }
        return res;
    }
}