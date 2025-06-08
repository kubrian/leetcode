class Solution {
    public boolean isValid(String word) {
        if (word.length() < 3) {
            return false;
        }

        word = word.toLowerCase();
        boolean hasVowel = false;
        boolean hasCons = false;
        for (int i = 0; i < word.length(); i++) {
            char x = word.charAt(i);
            if (hasVowel || x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u') {
                hasVowel = true;
            }
            if (hasCons || (Character.isLowerCase(x) && x != 'a' && x != 'e' && x != 'i' && x != 'o'
                    && x != 'u')) {
                hasCons = true;
            }
            if (!Character.isAlphabetic(x) && !Character.isDigit(x)) {
                return false;
            }
        }
        return hasVowel && hasCons;
    }
}
