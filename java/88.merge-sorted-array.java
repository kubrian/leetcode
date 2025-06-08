class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int curr = m + n - 1;
        while (i >= 0 && j >= 0) {
            // Search for the larger number
            // Use nums2
            if (nums1[i] <= nums2[j]) {
                nums1[curr--] = nums2[j--];
            } else {
                nums1[curr--] = nums1[i--];
            }
        }
        // Nums 1 is done
        while (j >= 0) {
            nums1[curr--] = nums2[j--];
        }
        // Nums 2 is done --> nums 1 alr assigned. Do nothing.
    }
}
