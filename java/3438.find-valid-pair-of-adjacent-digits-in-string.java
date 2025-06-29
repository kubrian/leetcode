class Solution {
    public String findValidPair(String s) {
        int[] freq = new int[10];
        for (char c : s.toCharArray()) {
            freq[c - '0']++;
        }
        for (int i = 0; i < s.length() - 1; i++) {
            char fir = s.charAt(i);
            char sec = s.charAt(i + 1);
            if (fir != sec && freq[fir - '0'] == (int) (fir - '0')
                    && freq[sec - '0'] == (int) (sec - '0')) {
                return "" + fir + sec;
            }
        }
        return "";
    }
}
