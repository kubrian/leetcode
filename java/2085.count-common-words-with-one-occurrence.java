import java.util.HashMap;
import java.util.Map;

class Solution {
    public int countWords(String[] words1, String[] words2) {
        Map<String, Integer> map = new HashMap<>();
        for (String word : words1) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        Map<String, Integer> map2 = new HashMap<>();
        for (String word : words2) {
            map2.put(word, map2.getOrDefault(word, 0) + 1);
        }
        int res = 0;
        for (String word : words1) {
            if (map.get(word) == 1 && map2.getOrDefault(word, 0) == 1) {
                res++;
            }
        }
        return res;
    }
}
