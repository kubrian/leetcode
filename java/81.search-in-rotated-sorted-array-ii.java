class Solution {
    public boolean search(int[] nums, int target) {
        int left = 0; // Incl
        int right = nums.length - 1; // Incl
        // Terminate when left = right (no more space to search)
        while (left < right) {
            int mid = left + (right - left) / 2; // mid = left is possible!
            if (nums[left] < nums[mid] || nums[mid] > nums[right]) {
                // Left half is sorted or right half is not
                if (nums[left] <= target && target <= nums[mid]) {
                    // Somewhere in between [left, mid]
                    right = mid;
                } else {
                    // Mid is not possible
                    left = mid + 1;
                }
            } else if (nums[mid] < nums[right] || nums[left] > nums[mid]) {
                // Right half is sorted or left half is not
                if (!(nums[mid] < target && target <= nums[right])) {
                    // Somewhere in between [left, mid]
                    right = mid;
                } else {
                    // Mid is not possible
                    left = mid + 1;
                }
            } else {
                // Can't tell, but if everything is the same, we can just get rid of left
                left++;
            }
        }
        return (left < nums.length) && (nums[left] == target);
    }
}
