import java.util.HashSet;
import java.util.Set;

class Solution {
    public int findMaxK(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int max = -1;
        for (int num : nums) {
            if (set.contains(-num)) {
                max = Math.max(max, Math.abs(num));
            }
        }
        return max;
    }
}
