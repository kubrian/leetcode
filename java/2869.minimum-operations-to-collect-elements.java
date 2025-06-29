import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public int minOperations(List<Integer> nums, int k) {
        Set<Integer> set = new HashSet<>();
        for (int i = 1; i <= k; i++) {
            set.add(i);
        }
        for (int i = nums.size() - 1; i >= 0; i--) {
            int num = nums.get(i);
            set.remove(num);
            if (set.isEmpty()) {
                return nums.size() - i;
            }
        }
        return 0;
    }
}
