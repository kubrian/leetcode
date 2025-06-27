class Solution {
    public String reversePrefix(String word, char ch) {
        int idx = word.indexOf(ch);
        if (idx == -1) {
            return word;
        }
        return new StringBuilder(word.substring(0, idx + 1)).reverse()
                .append(word, idx + 1, word.length()).toString();
    }
}
