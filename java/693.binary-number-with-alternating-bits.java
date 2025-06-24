class Solution {
    public boolean hasAlternatingBits(int n) {
        int t = (n ^ (n >> 1)); // All 1...
        return (t & (t + 1)) == 0;
    }
}
