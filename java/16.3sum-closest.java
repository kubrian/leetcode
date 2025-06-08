import java.util.Arrays;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int bestTarget = 1000000; // Rather large number
        int bestDiff = 1000000; // Rather large number
        int i = 0;

        while (i < nums.length) {
            int j = i + 1;
            int k = nums.length - 1;
            // Check
            while (j < k) {
                int curr = nums[i] + nums[j] + nums[k];
                int diff = Math.abs(target - curr);
                if (diff < bestDiff) {
                    bestTarget = curr;
                    bestDiff = diff;
                }
                if (bestDiff == 0) {
                    return bestTarget;
                }
                // If overshoot, increment j until diff number
                // otherwise, decrease k until diff number
                if (curr < target) {
                    int temp = nums[j];
                    while (j < k && nums[j] == temp)
                        j++;
                } else {
                    int temp = nums[k];
                    while (j < k && nums[k] == temp)
                        k--;
                }
            }
            int temp = nums[i];
            while (i < nums.length && nums[i] == temp)
                i++;
        }
        return bestTarget;
    }
}