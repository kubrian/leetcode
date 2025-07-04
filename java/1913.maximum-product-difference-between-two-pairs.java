import java.util.Arrays;

class Solution {
    public int maxProductDifference(int[] nums) {
        // Largest 2 and smallest 2 numbers
        Arrays.sort(nums);
        return nums[nums.length - 1] * nums[nums.length - 2] - nums[0] * nums[1];
    }
}
