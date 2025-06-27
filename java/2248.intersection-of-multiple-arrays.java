import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

class Solution {
    public List<Integer> intersection(int[][] nums) {
        List<Integer> res = new ArrayList<>();
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < nums.length; i++) {
            for (int num : nums[i]) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }
        for (int key : map.keySet()) {
            if (map.get(key) == nums.length) {
                res.add(key);
            }
        }
        return res;
    }
}
