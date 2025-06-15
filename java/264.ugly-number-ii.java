class Solution {
    public int nthUglyNumber(int n) {
        // All ugly numbers have the form
        // 2^x * 3^y * 5^z <=> 2 (2^(x-1) * ...) <=> 3 (3^(y-1) * ...) <=> 5 (5^(z-1) * ...)
        // Need to know where the subcases are -> use 3 indices to track, non trivial recursion.

        // Suppose x-th number is chosen from 2 * ugly[i], 3 * ugly[j], 5 * ugly[k].
        // Choose the smallest, e.g. i. Then, x+1-th should be i+1, j, k.

        int[] ugly = new int[n];
        ugly[0] = 1;
        int i = 0;
        int j = 0;
        int k = 0;
        for (int x = 1; x < n; x++) {
            int c1 = ugly[i] * 2;
            int c2 = ugly[j] * 3;
            int c3 = ugly[k] * 5;
            int min = Math.min(Math.min(c1, c2), c3);
            ugly[x] = min;
            if (min == c1) {
                i++;
            }
            if (min == c2) {
                j++;
            }
            if (min == c3) {
                k++;
            }
        }
        return ugly[n - 1];
    }
}
