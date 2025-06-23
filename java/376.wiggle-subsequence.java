class Solution {
    public int wiggleMaxLength(int[] nums) {
        // Clear relation to subproblem -- need max length AND up/down info from nums[:-1]
        int n = nums.length;
        int prevUpMax = 1;
        int prevDownMax = 1;

        for (int i = 1; i < n; i++) {
            int currUpMax = prevUpMax;
            int currDownMax = prevDownMax;
            if (nums[i] > nums[i - 1]) {
                currUpMax = prevDownMax + 1;
            }
            if (nums[i] < nums[i - 1]) {
                currDownMax = prevUpMax + 1;
            }
            prevDownMax = currDownMax;
            prevUpMax = currUpMax;
        }

        return Math.max(prevDownMax, prevUpMax);
    }
}
