class Solution {
    public int[] countBits(int n) {
        int[] res = new int[n + 1];
        for (int i = 1; i < res.length; i++) {
            // divide by 2 and add if odd
            res[i] = res[i >> 1] + (i & 1);
        }
        return res;
    }
}
