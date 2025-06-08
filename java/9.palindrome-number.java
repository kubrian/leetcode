class Solution {
    public boolean isPalindrome(int x) {
        int orig = x;
        int rev = 0;
        // Negative x will not enter
        while (x > 0) {
            rev = rev * 10 + x % 10;
            x /= 10;
        }
        return rev == orig;
    }
}