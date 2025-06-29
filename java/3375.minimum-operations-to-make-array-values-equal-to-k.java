import java.util.Arrays;

class Solution {
    public int minOperations(int[] nums, int k) {
        int min = Arrays.stream(nums).min().getAsInt();
        if (min < k) {
            return -1;
        }
        return (int) Arrays.stream(nums).distinct().filter(x -> x != k).count();
    }
}
