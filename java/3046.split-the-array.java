import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        return map.values().stream().allMatch(v -> v <= 2);
    }
}
