import java.util.Arrays;

class Solution {
    public int maximizeSum(int[] nums, int k) {
        int max = Arrays.stream(nums).max().getAsInt();
        return max * k + (k * (k - 1)) / 2;
    }
}
