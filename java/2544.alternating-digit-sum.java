class Solution {
    public int alternateDigitSum(int n) {
        int sum = 0;
        int sgn = 1;
        while (n > 0) {
            int d = (n % 10) * sgn;
            sum += d;
            n /= 10;
            sgn *= -1;
        }
        return sgn == -1 ? sum : -sum;
    }
}
