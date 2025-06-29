class Solution {
    public int maxFreqSum(String s) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        int v = 0;
        int c = 0;
        for (int i = 0; i < 26; i++) {
            if (i == 'a' - 'a' || i == 'e' - 'a' || i == 'i' - 'a' || i == 'o' - 'a' || i == 'u' - 'a') {
                v = Math.max(v, freq[i]);
            } else {
                c = Math.max(c, freq[i]);
            }
        }
        return v + c;
    }
}
