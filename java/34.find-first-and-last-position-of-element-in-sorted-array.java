class Solution {
    public int[] searchRange(int[] nums, int target) {
        // Exercise in writing binary search
        // First: min k such that x >= target for all x >= k
        int left = 0;
        int right = nums.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        int leftIndex = left < nums.length && nums[left] == target ? left : -1;

        // Second: max k such that x <= target for all x <= k
        left = -1;
        right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left + 1) / 2;
            if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid;
            }
        }

        int rightIndex = right >= 0 && nums[right] == target ? right : -1;
        return new int[] {leftIndex, rightIndex};
    }
}
