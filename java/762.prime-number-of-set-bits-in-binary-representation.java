class Solution {
    public int countPrimeSetBits(int left, int right) {
        int count = 0;
        for (int i = left; i <= right; i++) {
            if (Integer.bitCount(i) > 0 && isPrime(Integer.bitCount(i))) {
                count++;
            }
        }
        return count;
    }

    // 32 bit would suffice
    private boolean isPrime(int x) {
        return x == 2 || x == 3 || x == 5 || x == 7 || x == 11 || x == 13 || x == 17 || x == 19
                || x == 23 || x == 29 || x == 31;
    }
}
