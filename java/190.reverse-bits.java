class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int res = 0;
        for (int i = 0; i < 32; i++) {
            res <<= 1; // Shift left
            res |= (n & 1); // Take last of n
            n >>= 1; // Remove last of n
        }
        return res;
    }
}
