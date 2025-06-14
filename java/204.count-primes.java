class Solution {
    public int countPrimes(int n) {
        // Just do a sieve
        if (n < 3) {
            return 0;
        }
        boolean [] isPrime = new boolean[n];
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                continue;
            }
            count++;
            for (int j = 2 * i; j < n; j += i) {
                isPrime[j] = true;
            }
        }
        return count;
    }
}
