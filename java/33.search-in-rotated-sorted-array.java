class Solution {
    public int search(int[] nums, int target) {
        int left = 0; // Incl
        int right = nums.length - 1; // Incl
        // Terminate when left = right (no more space to search)
        while (left < right) {
            int mid = left + (right - left) / 2; // mid = left is possible!
            if (nums[mid] >= nums[left]) {
                // Left half is sorted
                if (nums[left] <= target && target <= nums[mid]) {
                    // Somewhere in between [left, mid]
                    right = mid;
                } else {
                    // Mid is not possible
                    left = mid + 1;
                }
            } else {
                // Right half is sorted
                if (!(nums[mid] < target && target <= nums[right])) {
                    // Somewhere in between [left, mid]
                    right = mid;
                } else {
                    // Mid is not possible
                    left = mid + 1;
                }
            }
        }
        return (left < nums.length) && (nums[left] == target) ? left : -1;
    }
}
