class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
        long[] res = new long[n];
        int[] indices = new int[primes.length];
        res[0] = 1;

        for (int i = 1; i < n; i++) {
            long min = Integer.MAX_VALUE;
            for (int j = 0; j < primes.length; j++) {
                min = Math.min(min, primes[j] * res[indices[j]]);
            }
            res[i] = (int) min;
            for (int j = 0; j < primes.length; j++) {
                if (min == primes[j] * res[indices[j]]) {
                    indices[j]++;
                }
            }
        }

        return (int) res[n - 1];
    }
}
