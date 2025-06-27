class Solution {
    public String maximumTime(String time) {
        // do it char by char
        char[] chars = time.toCharArray();
        if (chars[0] == '?') {
            if (chars[1] != '?' && chars[1] >= '4') {
                chars[0] = '1';
            } else {
                chars[0] = '2';
            }
        }
        if (chars[1] == '?') {
            chars[1] = chars[0] == '2' ? '3' : '9';
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
