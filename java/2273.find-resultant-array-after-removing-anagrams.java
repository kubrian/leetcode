import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> res = new ArrayList<>();
        String prev = words[0];
        res.add(prev);
        for (int i = 1; i < words.length; i++) {
            if (!isAnagram(prev, words[i])) {
                res.add(words[i]);
                prev = words[i];
            }
        }
        return res;
    }

    private boolean isAnagram(String w1, String s2) {
        int[] count = new int[26];
        for (char c : w1.toCharArray()) {
            count[c - 'a']++;
        }
        for (char c : s2.toCharArray()) {
            count[c - 'a']--;
        }
        for (int c : count) {
            if (c != 0) {
                return false;
            }
        }
        return true;
    }
}
