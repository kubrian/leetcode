import java.util.HashMap;
import java.util.Map;

class Solution {
    public int mostFrequent(int[] nums, int key) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == key) {
                freq.put(nums[i + 1], freq.getOrDefault(nums[i + 1], 0) + 1);
            }
        }
        // I cannot believe this comparator exists
        return freq.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();
    }
}
