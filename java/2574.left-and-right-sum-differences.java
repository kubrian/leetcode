class Solution {
    public int[] leftRightDifference(int[] nums) {
        int [] left = new int[nums.length];
        int [] right = new int[nums.length];
        left[0] = 0;
        right[nums.length - 1] = 0;
        for (int i = 1; i < nums.length; i++) {
            left[i] = left[i - 1] + nums[i - 1];
            right[nums.length - i - 1] = right[nums.length - i] + nums[nums.length - i];
        }
        int [] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            res[i] = Math.abs(left[i] - right[i]);
        }
        return res;
    }
}
