import java.util.HashSet;
import java.util.Set;

class Solution {
    public int similarPairs(String[] words) {
        int res = 0;
        Set<Character>[] sets = new HashSet[words.length];
        for (int i = 0; i < words.length; i++) {
            sets[i] = new HashSet<>();
            for (char c : words[i].toCharArray()) {
                sets[i].add(c);
            }
        }
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (sets[i].equals(sets[j])) {
                    res++;
                }
            }
        }
        return res;
    }
}
