class Solution {
    public boolean canBeIncreasing(int[] nums) {
        boolean hasRemoved = false;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] >= nums[i]) {
                if (hasRemoved) {
                    return false;
                }
                // Remove nums[i] or nums[i-1]
                if (i == 1 || nums[i - 2] < nums[i]) {
                    nums[i - 1] = nums[i];
                } else {
                    nums[i] = nums[i - 1];
                }
                hasRemoved = true;
            }
        }
        return true;
    }
}
