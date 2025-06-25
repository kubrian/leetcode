import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < order.length(); i++) {
            map.put(order.charAt(i), i);
        }

        for (int i = 0; i < words.length - 1; i++) {
            String word1 = words[i];
            String word2 = words[i + 1];

            boolean flag = false;
            for (int j = 0; j < Math.min(word1.length(), word2.length()); j++) {
                if (map.get(word1.charAt(j)) > map.get(word2.charAt(j))) {
                    return false;
                } else if (map.get(word1.charAt(j)) < map.get(word2.charAt(j))) {
                    flag = true;
                    break;
                }
            }

            if (!flag && word1.length() > word2.length()) {
                return false;
            }
        }

        return true;
    }

}
