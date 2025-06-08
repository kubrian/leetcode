class Solution {
    public void nextPermutation(int[] nums) {
        // Search from back to front for ascending sequence
        int posToSwap = nums.length - 1;
        while (posToSwap > 0 && nums[posToSwap - 1] >= nums[posToSwap]) {
            posToSwap--;
        }
        // Numbers are descending from pos (>=0) to end
        posToSwap -= 1;
        if (posToSwap != -1) {
            // Find next greater number then swap
            int nextGreaterPos = nums.length - 1;
            while (nums[nextGreaterPos] <= nums[posToSwap]) {
                nextGreaterPos--;
            }
            int temp = nums[posToSwap];
            nums[posToSwap] = nums[nextGreaterPos];
            nums[nextGreaterPos] = temp;
        }
        // Reverse from pos + 1 to end
        int start = posToSwap + 1;
        int end = nums.length - 1;
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
