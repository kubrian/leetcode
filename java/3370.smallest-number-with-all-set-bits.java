class Solution {
    public int smallestNumber(int n) {
        return (Integer.highestOneBit(n) << 1) - 1;
    }
}
