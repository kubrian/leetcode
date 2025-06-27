import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    public int countPoints(String rings) {
        Map<Integer, Set<Character>> map = new HashMap<>();
        for (int i = 0; i < rings.length(); i += 2) {
            int rod = rings.charAt(i + 1) - '0';
            char color = rings.charAt(i);
            map.computeIfAbsent(rod, k -> new HashSet<>()).add(color);

        }
        return (int) map.values().stream().filter(s -> s.size() == 3).count();
    }
}
