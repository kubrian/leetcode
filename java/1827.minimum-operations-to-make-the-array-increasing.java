class Solution {
    public int minOperations(int[] nums) {
        int res = 0;
        for (int i = 1; i < nums.length; i++) {
            int inc = Math.max(0, nums[i - 1] - nums[i] + 1);
            res += inc;
            nums[i] += inc;
        }
        return res;
    }
}
