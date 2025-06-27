import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean findSubarrays(int[] nums) {
        // Hash and check
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length - 1; i++) {
            int sum = nums[i] + nums[i + 1];
            if (set.contains(sum)) {
                return true;
            }
            set.add(sum);
        }
        return false;
    }
}
