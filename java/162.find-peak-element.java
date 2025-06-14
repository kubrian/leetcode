class Solution {
    public int findPeakElement(int[] nums) {
        // Binary search works only because neighbours have diff value
        // So there is always a slope between any two points
        // Since endpoints have decreasing slope outside, there must therefore exist a peak if we
        // choose to go to the direction of higher value
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < nums[mid + 1]) {
                left = mid + 1; // Cannot be mid, can be mid + 1
            } else {
                right = mid; // Can be mid, cannot be mid + 1
            }
        }
        return left;
    }
}
