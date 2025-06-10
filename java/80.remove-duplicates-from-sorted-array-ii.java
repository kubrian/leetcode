class Solution {
    public int removeDuplicates(int[] nums) {
        int slow = 0;
        for (int num : nums) {
            // Copy if number is larger than 2 prev pos
            if (slow < 2 || num > nums[slow - 2]) {
                nums[slow++] = num;
            }
        }
        return slow;
    }
}
