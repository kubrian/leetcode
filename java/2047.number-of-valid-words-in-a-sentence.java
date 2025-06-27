class Solution {
    public int countValidWords(String sentence) {
        String[] words = sentence.split("\\s+");
        int res = 0;
        for (String word : words) {
            if (isValid(word)) {
                res++;
            }
        }
        return res;
    }

    private boolean isValid(String word) {
        if (word.isEmpty())
            return false;

        int hyphenCount = 0;
        int punctuationCount = 0;

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);

            if (Character.isDigit(c)) {
                return false;
            } else if (c == '-') {
                hyphenCount++;
                if (hyphenCount > 1)
                    return false;
                if (i == 0 || i == word.length() - 1)
                    return false;
                if (!Character.isLetter(word.charAt(i - 1))
                        || !Character.isLetter(word.charAt(i + 1))) {
                    return false;
                }
            } else if (c == '!' || c == '.' || c == ',') {
                if (i != word.length() - 1)
                    return false;
                punctuationCount++;
                if (punctuationCount > 1)
                    return false;
            } else if (!Character.isLetter(c)) {
                return false;
            }
        }
        return true;
    }

}
