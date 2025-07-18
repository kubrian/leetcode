class Solution {
    public int findMinimumOperations(String s1, String s2, String s3) {
        int idx = 0;
        while (idx < s1.length() && idx < s2.length() && idx < s3.length()) {
            if (s1.charAt(idx) != s2.charAt(idx) || s1.charAt(idx) != s3.charAt(idx)) {
                if (idx == 0) {
                    return -1;
                } else {
                    break;
                }
            }
            idx++;
        }
        return s1.length() - idx + s2.length() - idx + s3.length() - idx;
    }
}
