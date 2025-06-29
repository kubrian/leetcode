class Solution {
    public int sumOfGoodNumbers(int[] nums, int k) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if ((i - k < 0 || nums[i - k] < nums[i])
                    && (i + k >= nums.length || nums[i + k] < nums[i])) {
                sum += nums[i];
            }
        }
        return sum;
    }
}
