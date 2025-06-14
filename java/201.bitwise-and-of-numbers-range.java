class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        // Find the common prefix of left and right
        // Everything after will be changed to 0
        int prefixLength = 0;
        while (left < right) {
            left >>= 1;
            right >>= 1;
            prefixLength++;
        }
        return left << prefixLength;
    }
}
