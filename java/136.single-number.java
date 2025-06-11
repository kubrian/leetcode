class Solution {
    public int singleNumber(int[] nums) {
        // Well... 0 xor A = A; A xor A = 0. so...
        int res = 0;
        for (int num : nums) {
            res ^= num;
        }
        return res;
    }
}
