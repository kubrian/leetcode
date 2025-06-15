class Solution {
    public int hIndex(int[] citations) {
        // Binary search?
        int n = citations.length;
        int left = 0;
        int right = n;
        while (left < right) {
            int mid = left + (right - left) / 2;
            int h = n - mid; // This is the h-th paper
            if (citations[mid] < h) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return n - left;
    }
}
