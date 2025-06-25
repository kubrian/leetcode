class Solution {
    public String freqAlphabets(String s) {
        // Go in reverse
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '#') {
                sb.append((char) ('a' - 1 + Integer.parseInt(s.substring(i - 2, i))));
                i -= 2;
            } else {
                sb.append((char) ('a' - 1 + Integer.parseInt(s.substring(i, i + 1))));
            }
        }
        return sb.reverse().toString();
    }
}
