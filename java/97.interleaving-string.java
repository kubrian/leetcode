class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        int l = s1.length();
        int r = s2.length();
        if (l + r != s3.length()) {
            return false;
        }
        boolean[][] res = new boolean[l + 1][r + 1];
        // res[i][j]: Match first i+j chars of s3 using first i chars of s1 and first j chars of s2
        res[0][0] = true;
        for (int i = 0; i <= l; i++) {
            for (int j = 0; j <= r; j++) {
                // Check from previous row (=s1 matching) or prev col (=s2 matching)
                res[i][j] |= (i > 0 && s1.charAt(i - 1) == s3.charAt(i + j - 1) && res[i - 1][j])
                        || (j > 0 && s2.charAt(j - 1) == s3.charAt(i + j - 1) && res[i][j - 1]);
            }
        }
        return res[l][r];
    }
}
