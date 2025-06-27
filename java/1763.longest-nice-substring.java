class Solution {
    public String longestNiceSubstring(String s) {
        boolean[] lower = new boolean[26];
        boolean[] upper = new boolean[26];
        for (char c : s.toCharArray()) {
            if (Character.isLowerCase(c)) {
                lower[c - 'a'] = true;
            } else {
                upper[c - 'A'] = true;
            }
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!lower[Character.toLowerCase(c) - 'a'] || !upper[Character.toUpperCase(c) - 'A']) {
                // Split here
                String front = longestNiceSubstring(s.substring(0, i));
                String back = longestNiceSubstring(s.substring(i + 1));
                if (front.length() >= back.length()) {
                    return front;
                } else {
                    return back;
                }
            }
        }
        return s;

    }
}
