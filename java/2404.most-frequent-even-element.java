import java.util.Map;
import java.util.TreeMap;

class Solution {
    public int mostFrequentEven(int[] nums) {
        Map<Integer, Integer> map = new TreeMap<>(); // TreeMap to sort keys
        for (int num : nums) {
            if (num % 2 == 0) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }
        int max = 0;
        int res = -1;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                res = entry.getKey();
            }
        }
        return res;
    }
}
