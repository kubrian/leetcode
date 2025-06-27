class Solution {
    public boolean isPrefixString(String s, String[] words) {
        int i = 0;
        for(String word: words) {
            if (i + word.length() > s.length()) {
                break;
            } else if (s.substring(i, i + word.length()).equals(word)) {
                i += word.length();
            } else {
                return false;
            }
        }
        return i == s.length();
    }
}
