class Solution {
    public int removeDuplicates(int[] nums) {
        // Trivial case
        if (nums.length == 1) {
            return 1;
        }
        int slow = 1;
        int fast = 1;
        while (fast < nums.length) {
            while (fast < nums.length && nums[fast] == nums[fast - 1]) {
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