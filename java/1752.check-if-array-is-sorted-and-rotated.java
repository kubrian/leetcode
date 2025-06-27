class Solution {
    public boolean check(int[] nums) {
        boolean hasDecreased = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < nums[(i + nums.length - 1) % nums.length]) {
                if (hasDecreased) {
                    return false;
                }
                hasDecreased = true;
            }
        }
        return true;
    }
}
