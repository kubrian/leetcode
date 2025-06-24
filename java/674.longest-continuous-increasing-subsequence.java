class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int max = 1;
        int curr = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                curr++;
                max = Math.max(max, curr);
            } else {
                curr = 1;
            }
        }
        return max;
    }
}
