class Solution {
    public int trailingZeroes(int n) {
        // Suppose n! = 2^x * 5^y * ...
        // ... does not contribute to 0
        // y < x because 5 > 2 (so factors of 5 are less common than factors of 2)
        int res = 0;
        while (n > 0) {
            res += n / 5;
            n /= 5;
        }
        return res;
    }
}
