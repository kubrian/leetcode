class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        return Math.min(k, numOnes) - (k <= numOnes + numZeros ? 0 : (k - numOnes - numZeros));
    }
}
