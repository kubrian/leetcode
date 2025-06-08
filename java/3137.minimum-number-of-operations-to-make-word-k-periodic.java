import java.util.HashMap;
import java.util.Map;

class Solution {
    public int minimumOperationsToMakeKPeriodic(String word, int k) {
        Map<String, Integer> fmap = new HashMap<>();
        int n = word.length();
        for (int i = 0; i < n / k; i++) {
            String s = word.substring(i * k, (i + 1) * k);
            fmap.put(s, fmap.getOrDefault(s, 0) + 1);
        }
        return n / k - fmap.values().stream().mapToInt(x -> x).max().orElse(0);
    }
}
