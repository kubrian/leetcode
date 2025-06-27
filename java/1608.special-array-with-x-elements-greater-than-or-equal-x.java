import java.util.Arrays;

class Solution {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        for (int x = 1; x <= n; x++) {
            // Count how many elements >= x
            int idx = Arrays.binarySearch(nums, x);
            if (idx < 0) {
                idx = -idx - 1;
            } else {
                // Find the first occurrence if duplicates
                while (idx > 0 && nums[idx - 1] >= x) {
                    idx--;
                }
            }
            int count = n - idx;

            if (count == x) {
                return x;
            }
        }
        return -1;
    }
}
