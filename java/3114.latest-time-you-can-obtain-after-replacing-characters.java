class Solution {
    public String findLatestTime(String s) {
        // HH then MM
        char[] chars = s.toCharArray();
        // first char
        if (chars[0] == '?') {
            if (chars[1] == '?' || chars[1] < '2') {
                chars[0] = '1';
            } else {
                chars[0] = '0';
            }
        }
        if (chars[1] == '?') {
            if (chars[0] == '1') {
                chars[1] = '1';
            } else {
                chars[1] = '9';
            }
        }
        if (chars[3] == '?') {
            chars[3] = '5';
        }
        if (chars[4] == '?') {
            chars[4] = '9';
        }
        return new String(chars);
    }
}
