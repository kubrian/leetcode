import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        List<String> res = new ArrayList<>();
        String currMax = words[0];
        int currGroup = groups[0];
        for (int i = 1; i < words.length; i++) {
            if (groups[i] == currGroup) {
                if (words[i].length() > currMax.length()) {
                    currMax = words[i];
                }
            } else {
                res.add(currMax);
                currMax = words[i];
                currGroup = groups[i];
            }
        }
        res.add(currMax);
        return res;
    }
}
