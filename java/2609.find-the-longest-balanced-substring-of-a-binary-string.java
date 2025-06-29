class Solution {
    public int findTheLongestBalancedSubstring(String s) {
        int res = 0;
        int i = 0;
        while (i < s.length()) {
            int zeros = 0;
            int ones = 0;
            while (i < s.length() && s.charAt(i) == '0') {
                zeros++;
                i++;
            }
            while (i < s.length() && s.charAt(i) == '1') {
                ones++;
                i++;
            }
            res = Math.max(res, Math.min(zeros, ones));
        }
        return res * 2;
    }
}
