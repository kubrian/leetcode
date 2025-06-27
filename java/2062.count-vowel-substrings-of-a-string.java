class Solution {
    public int countVowelSubstrings(String word) {
        int res = 0;
        for (int i = 0; i < word.length(); i++) {
            for (int j = i + 5; j <= word.length(); j++) {
                String w = word.substring(i, j);
                if (isVowelSubstring(w)) {
                    res++;
                }
            }
        }
        return res;
    }

    private boolean isVowelSubstring(String w) {
        boolean hasA = false;
        boolean hasE = false;
        boolean hasI = false;
        boolean hasO = false;
        boolean hasU = false;
        for (char c : w.toCharArray()) {
            if (c == 'a') {
                hasA = true;
            } else if (c == 'e') {
                hasE = true;
            } else if (c == 'i') {
                hasI = true;
            } else if (c == 'o') {
                hasO = true;
            } else if (c == 'u') {
                hasU = true;
            } else {
                return false;
            }
        }
        return hasA && hasE && hasI && hasO && hasU;
    }
}
