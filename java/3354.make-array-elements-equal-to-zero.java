import java.util.Arrays;

class Solution {
    public int countValidSelections(int[] nums) {
        // Find number of positions where left sum = right sum and num = 0
        int sum = Arrays.stream(nums).sum();
        int before = 0;
        int res = 0;
        for (int x : nums) {
            if (x == 0) {
                if (before == sum - before) {
                    res += 2;
                } else if (Math.abs(before - (sum - before)) == 1) {
                    res++;
                }
            }
            before += x;
        }
        return res;

    }
}
