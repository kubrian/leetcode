class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int prevOne = 0;
        while (prevOne < nums.length && nums[prevOne] != 1) {
            prevOne++;
        }
        for (int i = prevOne + 1; i < nums.length; i++) {
            if (nums[i] == 1) {
                if (i - prevOne <= k) {
                    return false;
                }
                prevOne = i;
            }
        }
        return true;
    }
}
