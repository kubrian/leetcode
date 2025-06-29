class Solution {
    public int semiOrderedPermutation(int[] nums) {
        int n = nums.length;
        int i1 = 0;
        int in = 0;
        // Find index of 1 and n
        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) {
                i1 = i;
            }
            if (nums[i] == n) {
                in = i;
            }
        }
        return i1 + (n - 1 - in) - (i1 < in ? 0 : 1);
    }
}
