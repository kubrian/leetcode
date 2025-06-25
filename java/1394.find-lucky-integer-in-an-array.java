import java.util.HashMap;
import java.util.Map;

class Solution {
    public int findLucky(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        return map.entrySet().stream().filter(e -> e.getKey() == e.getValue())
                .mapToInt(e -> e.getKey()).max().orElse(-1);
    }
}
