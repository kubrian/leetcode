import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (words.length != pattern.length()) {
            return false;
        }
        Map<Character, String> map = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = words[i];
            // Char used but not equal
            if (map.containsKey(c) && !map.get(c).equals(word)) {
                return false;
            }
            // Word used by another char
            if (map.containsValue(word) && !map.containsKey(c)) {
                return false;
            }
            map.put(c, word);
        }
        return true;
    }
}
