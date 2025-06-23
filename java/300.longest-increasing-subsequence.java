import java.util.Arrays;

class Solution {
    public int lengthOfLIS(int[] nums) {
        // When encountering x, compare it against all previous LIS
        int bestLength = 0;
        int[] endOfLIS = new int[nums.length];
        for (int x : nums) {
            int prevLIS = Arrays.binarySearch(endOfLIS, 0, bestLength, x);
            if (prevLIS < 0) {
                prevLIS = -prevLIS - 1; // insert position for not found keys
            }
            endOfLIS[prevLIS] = x;
            if (prevLIS == bestLength) {
                bestLength++;
            }
        }
        return bestLength;
    }
}
