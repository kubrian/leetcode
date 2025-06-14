class Solution {
    public int maxProduct(int[] nums) {
        int[] mins = new int[nums.length];
        int[] maxs = new int[nums.length];

        int max = nums[0];

        mins[0] = nums[0];
        maxs[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int currMin = Math.min(nums[i], Math.min(mins[i - 1] * nums[i], maxs[i - 1] * nums[i]));
            int currMax = Math.max(nums[i], Math.max(mins[i - 1] * nums[i], maxs[i - 1] * nums[i]));
            mins[i] = currMin;
            maxs[i] = currMax;
            max = Math.max(max, currMax);
        }

        return max;
    }
}
