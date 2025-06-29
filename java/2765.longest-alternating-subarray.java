class Solution {
    public int alternatingSubarray(int[] nums) {
        int res = -1;
        for (int i = 0; i < nums.length; i++) {
            int j = i + 1;
            while (j < nums.length && ((j - i) % 2 == 0 && nums[i] == nums[j]
                    || (j - i) % 2 == 1 && nums[j] - nums[i] == 1)) {
                res = Math.max(res, j - i + 1);
                j++;
            }
        }
        return res;
    }
}
