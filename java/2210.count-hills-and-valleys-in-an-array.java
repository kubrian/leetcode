class Solution {
    public int countHillValley(int[] nums) {
        int res = 0;
        int prev = nums[0];
        for (int i = 1; i < nums.length - 1; i++) {
            if (prev < nums[i] && nums[i] > nums[i + 1]
                    || prev > nums[i] && nums[i] < nums[i + 1]) {
                res++;
                prev = nums[i];
                // Update only here, else in increasing/decreasing/flat seq, no reason to change
            }
        }
        return res;
    }
}
