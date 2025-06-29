import java.util.Arrays;

class Solution {
    public int countPartitions(int[] nums) {
        int sum = Arrays.stream(nums).sum();
        int leftSum = 0;
        int parts = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            int x = nums[i];
            leftSum += x;
            if (((sum - leftSum) - leftSum) % 2 == 0) {
                parts++;
            }
        }
        return parts;
    }
}
