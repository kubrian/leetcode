class Solution {
    public int mySqrt(int x) {
        if (x <= 1) {
            return x;
        }
        // x is at least 2
        int low = 1;
        int high = x;
        // Invariant: low ** 2 <= x
        while (low <= high) {
            int mid = low + (high - low) / 2;
            long curr = (long) mid * mid;
            if (curr == x) {
                return mid;
            } else if (curr < x) { // New lower bound
                low = mid + 1;
            } else {
                high = mid - 1; // New upper bound
            }
        }
        return (long) high * high <= x ? high : low;
    }
}