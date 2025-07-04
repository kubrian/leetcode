class Solution {
    public int countSubarrays(int[] nums) {
        int res = 0;
        for (int i = 2; i < nums.length; i++) {
            if (2 * (nums[i - 2] + nums[i]) == nums[i - 1]) {
                res++;
            }
        }
        return res;
    }
}
