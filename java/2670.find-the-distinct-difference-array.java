import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        Map<Integer, Integer> before = new HashMap<>();
        Map<Integer, Integer> after = new HashMap<>();

        for (int x : nums) {
            after.put(x, after.getOrDefault(x, 0) + 1);
        }

        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i];
            after.put(curr, after.get(curr) - 1);
            if (after.get(curr) == 0) {
                after.remove(curr);
            }
            before.put(curr, before.getOrDefault(curr, 0) + 1);
            res[i] = before.size() - after.size();
        }
        return res;
    }
}
