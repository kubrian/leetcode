import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    public String bestHand(int[] ranks, char[] suits) {
        Set<Character> set = new HashSet<>();
        for (char suit : suits) {
            set.add(suit);
        }
        if (set.size() == 1) {
            return "Flush";
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int rank : ranks) {
            map.put(rank, map.getOrDefault(rank, 0) + 1);
        }
        if (map.values().stream().anyMatch(v -> v >= 3)) {
            return "Three of a Kind";
        }
        if (map.values().stream().anyMatch(v -> v == 2)) {
            return "Pair";
        }
        return "High Card";
    }
}
