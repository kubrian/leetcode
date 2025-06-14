import java.util.Arrays;

class Solution {
    public int rob(int[] nums) {
        // Choose to rob or not
        if (nums.length <= 2) {
            return Arrays.stream(nums).max().orElse(0);
        }
        int bestLastTwo = nums[0];
        int bestLast = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            int currBest = Math.max(bestLastTwo + nums[i], bestLast);
            bestLastTwo = bestLast;
            bestLast = currBest;
        }
        return bestLast;
    }
}
