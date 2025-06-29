class Solution {
    public int maximumStrongPairXor(int[] nums) {
        int res = 0;
        for (int x : nums) {
            for (int y : nums) {
                if (Math.abs(x - y) <= Math.min(x, y)) {
                    res = Math.max(res, x ^ y);
                }
            }
        }
        return res;
    }
}
