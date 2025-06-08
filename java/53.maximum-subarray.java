class Solution {
    public int maxSubArray(int[] nums) {
        int best = Integer.MIN_VALUE;
        int curr = 0;
        for (int x : nums) {
            curr += x;
            best = Math.max(curr, best);
            curr = Math.max(0, curr);
        }
        return best;
    }
}
