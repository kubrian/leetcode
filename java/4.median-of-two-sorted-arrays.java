class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }
        // nums1 <= nums2 in size
        int n1 = nums1.length;
        int n2 = nums2.length;

        // Binary search for the index on the longer array, call this variable L2.
        int size = (n1 + n2 + 1) / 2; // 5 -> 3; 6 -> 3.

        // The smallest index possible is such that all of l1 used.
        int l = size - n1 - 1;
        // The largest index possible is such that none of l1 used
        int r = size - 1;

        while (true) { // Stop when l == r
            int m2 = l + (r - l) / 2; // Index, so no. of elements = this + 1
            int m1 = size - (m2 + 1) - 1; // Index

            // Both left less than both next. Edge case when none or all of nums[1] is used.
            // Check if partition is valid
            boolean isValidPartition = (m1 == n1 - 1 || nums2[m2] <= nums1[m1 + 1])
                    && (m1 == -1 || nums1[m1] <= nums2[m2 + 1]);

            // Return if valid
            if (isValidPartition) {
                // Check for odd and even
                int f = Math.max(m1 != -1 ? nums1[m1] : Integer.MIN_VALUE,
                        m2 != -1 ? nums2[m2] : Integer.MIN_VALUE);
                if ((n1 + n2) % 2 == 1) {
                    return f;
                } else {
                    int s = Math.min(m1 != n1 - 1 ? nums1[m1 + 1] : Integer.MAX_VALUE,
                            m2 != n2 - 1 ? nums2[m2 + 1] : Integer.MAX_VALUE);
                    return (f + s) / 2.0;
                }
            }
            // m2 is too small -- new l
            if (m2 == -1 || nums2[m2] < nums1[m1]) {
                l = m2 + 1;
            } else {
                r = m2 - 1;
            }
        }
    }
}
