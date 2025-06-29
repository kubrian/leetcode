import java.util.Arrays;

class Solution {
    public int minDeletion(String s, int k) {
        int[] count = new int[26];
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }
        Arrays.sort(count);
        int chars = 0;
        int dist = 0;
        for (int i = 25; i >= 0; i--) {
            if (count[i] != 0) {
                chars += count[i];
                dist++;
            }
            if (dist == k) {
                return s.length() - chars;
            }
        }
        return 0;
    }
}
