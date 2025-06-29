import java.util.HashMap;
import java.util.Map;

class Solution {
    public int winningPlayerCount(int n, int[][] pick) {
        Map<Integer, Map<Integer, Integer>> map = new HashMap<>(); // player -> color -> freq
        for (int[] p : pick) {
            map.computeIfAbsent(p[0], k -> new HashMap<>()).compute(p[1],
                    (k, v) -> v == null ? 1 : v + 1);
        }
        int counts = 0;
        for (Map.Entry<Integer, Map<Integer, Integer>> e : map.entrySet()) {
            int player = e.getKey();
            int max = 0;
            for (Map.Entry<Integer, Integer> e2 : e.getValue().entrySet()) {
                max = Math.max(max, e2.getValue());
            }
            if (max > player) {
                counts++;
            }
        }
        return counts;
    }
}
