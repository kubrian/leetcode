import java.util.Arrays;

class Solution {
    public int[] shortestToChar(String s, char c) {
        int[] res = new int[s.length()];
        Arrays.fill(res, s.length());
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                for (int j = 0; j <= i; j++) {
                    res[j] = Math.min(res[j], i - j);
                }
                for (int j = i + 1; j < s.length(); j++) {
                    res[j] = Math.min(res[j], j - i);
                }
            }
        }
        return res;
    }
}
