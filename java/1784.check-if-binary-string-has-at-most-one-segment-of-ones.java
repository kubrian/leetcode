class Solution {
    public boolean checkOnesSegment(String s) {
        int idx = 0;
        while (idx < s.length() && s.charAt(idx) == '1') {
            idx++;
        }
        while (idx < s.length() && s.charAt(idx) == '0') {
            idx++;
        }
        return idx == s.length();
    }
}
