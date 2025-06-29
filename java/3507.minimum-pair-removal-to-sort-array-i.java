class Solution {
    public int minimumPairRemoval(int[] nums) {
        // Just brute force
        int end = nums.length - 1;
        int op = 0;
        while (end >= 1) {
            boolean inc = true;
            int minSum = nums[0] + nums[1];
            int minIdx = 0;
            for (int i = 1; i <= end; i++) {
                // Check dec
                if (nums[i] < nums[i - 1]) {
                    inc = false;
                }
                if (nums[i] + nums[i - 1] < minSum) {
                    minSum = nums[i] + nums[i - 1];
                    minIdx = i - 1;
                }
            }
            if (inc) {
                return op;
            }
            nums[minIdx] = minSum;
            for (int i = minIdx + 1; i < end; i++) {
                nums[i] = nums[i + 1];
            }
            end--;
            op++;
        }
        return op;
    }
}
