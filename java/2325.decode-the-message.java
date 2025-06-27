import java.util.HashMap;
import java.util.Map;

class Solution {
    public String decodeMessage(String key, String message) {
        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < key.length(); i++) {
            if (key.charAt(i) != ' ') {
                map.putIfAbsent(key.charAt(i), (char) ('a' + map.size()));
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char c : message.toCharArray()) {
            if (c == ' ') {
                sb.append(' ');
            } else {
                sb.append(map.get(c));
            }
        }
        return sb.toString();
    }
}
