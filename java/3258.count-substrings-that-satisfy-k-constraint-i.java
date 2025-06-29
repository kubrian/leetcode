class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        int ones = 0;
        int zeros = 0;
        int l = 0; // incl
        int r = 0; // incl
        int res = 0;
        while (r < s.length()) {
            if (s.charAt(r) == '1') {
                ones++;
            } else {
                zeros++;
            }
            // Remove from front if needed
            while (ones > k && zeros > k) {
                if (s.charAt(l) == '1') {
                    ones--;
                } else {
                    zeros--;
                }
                l++;
            }
            res += r - l + 1;
            r++;
        }
        return res;
    }
}
