import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int distinctAverages(int[] nums) {
        Set<Double> set = new HashSet<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length / 2; i++) {
            set.add((double) (nums[i] + nums[nums.length - 1 - i]) / 2);
        }
        return set.size();
    }
}
