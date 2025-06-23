class Solution {
    public int findNthDigit(int n) {
        int len = 1;
        long curr = 1;
        // Just grind out the numbers
        // There are 9 1-digit chars, 90 2-digit chars, ...
        while (n > len * 9 * curr) {
            n -= len * 9 * curr;
            len++;
            curr *= 10;
        }
        // Find num and pos
        long num = curr + (n - 1) / len;
        int pos = (n - 1) % len;
        return Character.getNumericValue(String.valueOf(num).charAt(pos));
    }
}
