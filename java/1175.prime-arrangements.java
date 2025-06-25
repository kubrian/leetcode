import java.util.Arrays;

class Solution {
    public int numPrimeArrangements(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;
        for (int i = 2; i <= n / i; i++) {
            if (isPrime[i]) {
                for (long j = (long) i * i; j <= n; j += i) {
                    isPrime[(int) j] = false;
                }
            }
        }

        int primeCount = 0;
        for (int i = 0; i <= n; i++) {
            if (isPrime[i]) {
                primeCount++;
            }
        }

        int nonPrimeCount = n - primeCount;
        long ans = 1;
        for (int i = 1; i <= nonPrimeCount; i++) {
            ans *= i;
            ans %= 1000000007;
        }
        for (int i = 1; i <= primeCount; i++) {
            ans *= i;
            ans %= 1000000007;
        }
        return (int) ans;
    }
}
