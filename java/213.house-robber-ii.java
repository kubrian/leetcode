class Solution {
    public int rob(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }

        // Ignore first
        int lastTwoBest = nums[1];
        int lastBest = Math.max(nums[1], nums[2]);
        for (int i = 3; i < nums.length; i++) {
            int currBest = Math.max(lastTwoBest + nums[i], lastBest);
            lastTwoBest = lastBest;
            lastBest = currBest;
        }
        
        // Ignore last
        int firstTwoBest = nums[0];
        int firstBest = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length - 1; i++) {
            int currBest = Math.max(firstTwoBest + nums[i], firstBest);
            firstTwoBest = firstBest;
            firstBest = currBest;
        }
        
        return Math.max(lastBest, firstBest);
    }
}
