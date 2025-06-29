import java.util.HashSet;
import java.util.Set;

class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int res = 0;
        for (int num : nums) {
            if (set.contains(num)) {
                res ^= num;
            } else {
                set.add(num);
            }
        }
        return res;
    }
}
