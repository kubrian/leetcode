class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int maxDiff = Math.abs(nums[nums.length - 1] - nums[0]);
        for (int i = 1; i < nums.length; i++) {
            maxDiff = Math.max(maxDiff, Math.abs(nums[i] - nums[i - 1]));
        }
        return maxDiff;
    }
}
