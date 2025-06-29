class Solution {
    public int maxDifference(String s) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 26; i++) {
            if (freq[i] % 2 == 1) {
                for (int j = 0; j < 26; j++) {
                    if (freq[j] % 2 == 0 && freq[j] != 0) {
                        max = Math.max(max, freq[i] - freq[j]);
                    }
                }
            }
        }
        return max;
    }
}
