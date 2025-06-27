class Solution {
    public int findKthPositive(int[] arr, int k) {
        // Number of missing numbers at index i is A[i] - i - 1
        // E.g. index 2 number is 4 then 1 number must be missing across index 0 and 1
        // So this is binary searchable since the numebr of missing numbers is non decreasing
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int missing = arr[mid] - (mid + 1);
            if (missing < k) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start + k;
    }
}
