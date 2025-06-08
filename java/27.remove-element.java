class Solution {
    public int removeElement(int[] nums, int val) {
        int slow = 0;
        int fast = 0;
        while (fast < nums.length) {
            while (fast < nums.length && nums[fast] == val) {
                fast++;
            }
            // Fast is now at the position to insert next number
            if (fast < nums.length) {
                nums[slow++] = nums[fast++];
            }
        }
        return slow;
    }
}