import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

class Solution {
    public int largestInteger(int[] nums, int k) {
        // Only one subarray
        if (k == nums.length) {
            return Arrays.stream(nums).max().getAsInt();
        }

        // At least 2 subarrays, get freq map
        Map<Integer, Integer> map = new TreeMap<>(Collections.reverseOrder());
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        if (k == 1) {
            // Every element only shows up in one subarray
            // Find maximum with count = 1
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() == 1) {
                    return entry.getKey();
                }
            }
            return -1;
        }

        // Every element in at least 2 subarrays, only first and last are candidates
        int res = -1;
        if (map.get(nums[0]) == 1) {
            res = nums[0];
        }
        if (map.get(nums[nums.length - 1]) == 1) {
            res = Math.max(res, nums[nums.length - 1]);
        }
        return res;
    }
}
