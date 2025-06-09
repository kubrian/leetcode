class Solution {
    public boolean canJump(int[] nums) {
        int end = nums.length - 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            // i can reach end -> check if we can reach i
            if (i + nums[i] >= end) {
                end = i;
            }
        }
        // end == 0 means we can reach 0
        return end == 0;
    }
}
