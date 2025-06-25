import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        Arrays.sort(nums);
        List<Integer> res = new ArrayList<>();
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        int currSum = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            currSum += nums[i];
            res.add(nums[i]);
            if (currSum > sum - currSum) {
                break;
            }
        }
        return res;
    }
}
