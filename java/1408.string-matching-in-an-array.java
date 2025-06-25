import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> res = new ArrayList<>();
        for (String word : words) {
            for (String other : words) {
                if (word.equals(other)) {
                    continue;
                }
                if (other.contains(word)) {
                    res.add(word);
                    break;
                }
            }
        }
        return res;
    }
}
