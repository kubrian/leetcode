class Solution {
    public boolean hasSpecialSubstring(String s, int k) {
        int i = 0;
        int consec = 0;
        while (i < s.length()) {
            if (i == 0 || s.charAt(i) == s.charAt(i - 1)) {
                consec++;
            } else {
                consec = 1;
            }
            if (consec == k && (i + 1 == s.length() || s.charAt(i + 1) != s.charAt(i))) {
                return true;
            }
            i++;
        }
        return false;
    }
}
