import java.util.HashSet;
import java.util.Set;

class Solution {
    public int minimumOperations(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = nums.length - 1; i >= 0; i--) {
            if (set.contains(nums[i])) {
                return i / 3 + 1; // e.g. (0, 1, 2) -> need 1
            } else {
                set.add(nums[i]);
            }
        }
        return 0;
    }
}
