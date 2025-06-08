class Solution {
    public int divide(int dividend, int divisor) {
        // Handle overflow cases
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        if (dividend == Integer.MIN_VALUE && divisor == 1) {
            return Integer.MIN_VALUE;
        }

        // Determine the sign of the result
        boolean isNegative = (dividend < 0) ^ (divisor < 0);

        // Work with negative numbers to avoid overflow
        dividend = dividend > 0 ? -dividend : dividend;
        divisor = divisor > 0 ? -divisor : divisor;

        int res = 0;
        while (dividend <= divisor) {
            int shift = 0;
            // Find the largest shift such that (divisor << shift) >= dividend
            while (dividend <= (divisor << shift) && (divisor << shift) < 0 && shift < 31) {
                shift++;
            }
            shift--; // Backtrack to avoid overshooting
            res += 1 << shift;
            dividend -= divisor << shift;
        }

        return isNegative ? -res : res;
    }
}