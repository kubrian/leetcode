class Solution {
    public int longestAlternatingSubarray(int[] nums, int threshold) {
        int res = 0;
        for (int l = 0; l < nums.length; l++) {
            if (nums[l] % 2 == 0 && nums[l] <= threshold) {
                int r = l;
                while (r < nums.length && nums[r] <= threshold
                        && (r - 1 < l || nums[r] % 2 != nums[r - 1] % 2)) {
                    res = Math.max(res, r - l + 1);
                    r++;
                }
            }
        }
        return res;
    }
}
