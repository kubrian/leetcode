class Solution {
    public int minChanges(int n, int k) {
        int xor = n ^ k;
        int nset = xor & n;
        return nset == xor ? Integer.bitCount(nset) : -1;
    }
}

