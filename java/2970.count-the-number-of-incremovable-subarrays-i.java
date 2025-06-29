class Solution {
    public int incremovableSubarrayCount(int[] nums) {
        int n = nums.length;
        int res = 0;
        for (int i = 0; i < n; i++) { // start of subarray
            for (int j = i; j < n; j++) { // end of subarray
                boolean isIncreasing = true;
                int prev = Integer.MIN_VALUE;
                for (int k = 0; k < n; k++) { // Remaining
                    if (k >= i && k <= j) {
                        k = j; // Skip, so that next one is j + 1 > k
                        continue;
                    }
                    if (nums[k] <= prev) {
                        isIncreasing = false;
                        break;
                    }
                    prev = nums[k];
                }
                if (isIncreasing) {
                    res++;
                }
            }
        }
        return res;
    }
}
