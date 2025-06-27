class Solution {
    public String modifyString(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '?') {
                char prev = i == 0 ? 'a' : chars[i - 1];
                char next = i == chars.length - 1 ? 'a' : chars[i + 1];
                for (char c = 'a'; c <= 'c'; c++) {
                    if (c != prev && c != next) {
                        chars[i] = c;
                        break;
                    }
                }
            }
        }
        return new String(chars);
    }
}
