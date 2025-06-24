class Solution {
    public boolean repeatedSubstringPattern(String s) {
        // If s = k * some string n, then s * 2 = 2k * n.
        // s must be inside s * 2 excluding first and last char
        return s.length() > 1 && (s + s).substring(1, s.length() * 2 - 1).contains(s);
    }
}
