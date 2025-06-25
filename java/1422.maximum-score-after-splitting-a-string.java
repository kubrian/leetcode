class Solution {
    public int maxScore(String s) {
        int numOnesRight = 0;
        for (char c : s.toCharArray()) {
            if (c == '1') {
                numOnesRight++;
            }
        }
        int numZerosLeft = 0;
        int res = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '0') {
                numZerosLeft++;
            } else {
                numOnesRight--;
            }
            res = Math.max(res, numZerosLeft + numOnesRight);
        }
        return res;
    }
}
