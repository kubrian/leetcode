class Solution {
    public int maximumLengthSubstring(String s) {
        int[] map = new int[26];
        int left = 0;
        int right = 0;
        String longest = "";

        while (right < s.length()) {
            char c = s.charAt(right);
            int co = map[c - 'a'];
            if (co < 2) {
                // Case 1: <2, just include
                right++;
                map[c - 'a']++;
            } else {
                // Case 2: = 2. Log current, move left until this count is < 0,
                String curr = s.substring(left, right);
                longest = longest.length() > curr.length() ? longest : curr;

                while (map[c - 'a'] == 2) {
                    map[s.charAt(left++) - 'a']--;
                }
                right++;
                map[c - 'a']++;
            }
        }
        String curr = s.substring(left, right);
        longest = longest.length() > curr.length() ? longest : curr;
        return longest.length();
    }
}
