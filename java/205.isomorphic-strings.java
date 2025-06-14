import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            // Same key diff value
            if (map.containsKey(c1) && map.get(c1) != c2) {
                return false;
            }
            // Same value diff key
            if (map.containsValue(c2) && !map.containsKey(c1)) {
                return false;
            }
            map.put(c1, c2);
        }
        return true;
    }
}
