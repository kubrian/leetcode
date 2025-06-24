class Solution {
    public boolean detectCapitalUse(String word) {
        return word.toUpperCase().equals(word) || word.toLowerCase().equals(word)
                || ((word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase())
                        .equals(word));
    }
}
