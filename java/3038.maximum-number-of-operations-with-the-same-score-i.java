class Solution {
    public int maxOperations(int[] nums) {
        int res = 1;
        int score = nums[0] + nums[1];
        for (int i = 2; i + 1 < nums.length; i += 2) {
            if (score == nums[i] + nums[i + 1]) {
                res++;
            } else {
                break;
            }
        }
        return res;
    }
}
