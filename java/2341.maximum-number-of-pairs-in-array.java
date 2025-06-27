import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] numberOfPairs(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int[] res = new int[2];
        for (int v : map.values()) {
            res[0] += v / 2;
            res[1] += v % 2;
        }
        return res;
    }
}
