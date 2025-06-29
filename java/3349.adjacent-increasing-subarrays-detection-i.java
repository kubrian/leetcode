import java.util.List;

class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        for (int i = 0; i < nums.size() - 2 * k + 1; i++) {
            // Find first increasing subarray
            int j = i;
            while (j < i + k - 1 && nums.get(j) < nums.get(j + 1)) {
                j++;
            }
            if (j != i + k - 1) {
                continue;
            }
            // Find second increasing subarray
            j = i + k;
            while (j < i + 2 * k - 1 && nums.get(j) < nums.get(j + 1)) {
                j++;
            }
            if (j != i + 2 * k - 1) {
                continue;
            }
            return true;
        }
        return false;
    }
}
