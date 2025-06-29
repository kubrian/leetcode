import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> res = new ArrayList<>();
        for (String word : words) {
            // Use [] to put even special chars in group
            String[] parts = word.split("[" + separator + "]");
            for (String part : parts) {
                if (part.isEmpty()) {
                    continue;
                }
                res.add(part);
            }
        }
        return res;
    }
}
