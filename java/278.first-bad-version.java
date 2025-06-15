class Solution extends VersionControl {
    // Classic binary search, find smallest k such that f(x) is True whenever x >= k
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid)) {
                right = mid; // Can be mid
            } else {
                left = mid + 1; // Cannot be mid
            }
        }
        return left;
    }
}
