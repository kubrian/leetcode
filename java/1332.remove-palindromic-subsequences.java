class Solution {
    public int removePalindromeSub(String s) {
        if (s.length() == 0) {
            return 0;
        } else if (s.equals(new StringBuilder(s).reverse().toString())) {
            return 1;
        } else {
            // remove all a then all b
            return 2;
        }
    }
}
