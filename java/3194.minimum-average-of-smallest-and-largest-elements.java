import java.util.Arrays;

class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        double res = (nums[0] + nums[nums.length - 1]) / 2.0;
        for (int i = 1; i < nums.length - 1; i++) {
            res = Math.min(res, (nums[i] + nums[nums.length - 1 - i]) / 2.0);
        }
        return res;
    }
}
