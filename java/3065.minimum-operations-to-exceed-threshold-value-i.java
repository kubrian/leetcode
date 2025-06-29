class Solution {
    public int minOperations(int[] nums, int k) {
        int res = 0;
        for (int n : nums) {
            if (n < k) {
                res++;
            }
        }
        return res;
    }
}
