import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        // Sort -> Map -> Count
        int[] sorted = nums.clone();
        Arrays.sort(sorted);
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < sorted.length; i++) {
            map.putIfAbsent(sorted[i], i);
        }
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            res[i] = map.get(nums[i]);
        }
        return res;
    }
}
