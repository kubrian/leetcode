class Solution {
    public String firstPalindrome(String[] words) {
        String res = "";
        for (String word : words) {
            if (isPalindrome(word)) {
                res = word;
                break;
            }
        }
        return res;
    }

    private boolean isPalindrome(String s) {
        return s.equals(new StringBuilder(s).reverse().toString());
    }
}
