class Solution {
    public int removeDuplicates(int[] nums) {
        int slow = 0;
        for (int num : nums) {
            // Copy if number is larger than prev pos
            if (slow < 1 || num > nums[slow - 1]) {
                nums[slow++] = num;
            }
        }
        return slow;
    }
}
