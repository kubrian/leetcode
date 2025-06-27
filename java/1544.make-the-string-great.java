class Solution {
    public String makeGood(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (sb.length() == 0) {
                sb.append(c);
            } else {
                char prev = sb.charAt(sb.length() - 1);
                if (Math.abs(c - prev) == 32) { // Shortcut for checking opposite case
                    sb.deleteCharAt(sb.length() - 1);
                } else {
                    sb.append(c);
                }
            }
        }
        return sb.toString();
    }
}
