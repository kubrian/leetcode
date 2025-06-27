class Solution {
    public boolean isCircularSentence(String sentence) {
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            char frontLast = words[i].charAt(words[i].length() - 1);
            char backFirst = words[(i + 1) % words.length].charAt(0);
            if (frontLast != backFirst) {
                return false;
            }
        }
        return true;
    }
}
