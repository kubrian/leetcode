class Solution {
    public int numberOfChild(int n, int k) {
        k = k % (2 * (n - 1));
        if (k < n - 1) {
            return k;
        } else {
            return 2 * (n - 1) - k;
        }
    }
}
