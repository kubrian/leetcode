class Solution {
    public boolean hasSameDigits(String s) {
        while (s.length() > 2) {
            StringBuilder sb = new StringBuilder();
            for (int i = 1; i < s.length(); i++) {
                int f = s.charAt(i - 1) - '0';
                int n = s.charAt(i) - '0';
                sb.append((f + n) % 10);
            }
            s = sb.toString();
        }
        return s.charAt(0) == s.charAt(1);
    }
}
