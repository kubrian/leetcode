import java.util.HashSet;
import java.util.Set;

class Solution {
    public int totalNumbers(int[] digits) {
        // O(n^3) it is
        Set<Integer> nums = new HashSet<>();
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] == 0) {
                continue;
            }
            for (int j = 0; j < digits.length; j++) {
                if (i == j) {
                    continue;
                }
                for (int k = 0; k < digits.length; k++) {
                    if (i == k || j == k) {
                        continue;
                    }
                    if (digits[k] % 2 == 0) {
                        nums.add(digits[i] * 100 + digits[j] * 10 + digits[k]);
                    }
                }
            }
        }
        return nums.size();
    }
}
