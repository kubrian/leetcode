class Solution {
    public boolean isPowerOfTwo(int n) {
        // All powers of 2 only have 1 bit set, so remove it by subtracting 1
        return n > 0 && (n & (n - 1)) == 0;
    }
}
