class Solution {
    public int findClosestNumber(int[] nums) {
        int min = nums[0];
        for (int x : nums) {
            if (Math.abs(x) < Math.abs(min)) {
                min = x;
            } else if (Math.abs(x) == Math.abs(min) && x > 0) {
                min = x;
            }
        }
        return min;
    }
}
