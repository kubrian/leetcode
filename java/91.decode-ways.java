class Solution {
    public int numDecodings(String s) {
        // res[i] stores number of encodings for substring starting at i
        int[] res = new int[s.length() + 1];
        res[s.length()] = 1; // Empty string is valid

        for (int i = s.length() - 1; i >= 0; i--) {
            // Check current character
            char curr = s.charAt(i);

            // One char -> Not 0
            if (curr != '0') {
                res[i] = res[i + 1];
            }

            // Two char -> 1x or 2y, y is 1-6
            if (i + 1 < s.length() && (curr == '1' || curr == '2' && s.charAt(i + 1) <= '6')) {
                res[i] += res[i + 2];
            }
        }

        return res[0];
    }
}
