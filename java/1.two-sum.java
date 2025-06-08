import java.util.HashMap;
import java.util.Map;

class Solution {
    /**
     * Returns an array that contains the two indices of the numbers in nums
     * such that they add up to target. Unique solution guaranteed, order does
     * not matter.
     */
    public int[] twoSum(int[] nums, int target) {
        // Store the integers that were encountered alongside the index
        Map<Integer, Integer> numToIndexMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            int complement = target - current;
            if (numToIndexMap.containsKey(complement)) {
                return new int[] { i, numToIndexMap.get(complement) };
            } else {
                numToIndexMap.put(current, i);
            }
        }
        // Should not reach here
        return null;
    }
}
