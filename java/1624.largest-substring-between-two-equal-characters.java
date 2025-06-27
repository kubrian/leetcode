import java.util.Arrays;

class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int[] prevOccur = new int[26];
        Arrays.fill(prevOccur, -1);
        int res = -1;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (prevOccur[c - 'a'] != -1) {
                res = Math.max(res, i - prevOccur[c - 'a'] - 1);
            } else {
                prevOccur[c - 'a'] = i;
            }
        }
        return res;
    }
}
