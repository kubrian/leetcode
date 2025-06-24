class Solution {
    public int minCostClimbingStairs(int[] cost) {
        // Try backwards dp
        int[] res = new int[cost.length];
        res[cost.length - 1] = cost[cost.length - 1];
        res[cost.length - 2] = cost[cost.length - 2];
        for (int i = cost.length - 3; i >= 0; i--) {
            res[i] = cost[i] + Math.min(res[i + 1], res[i + 2]);
        }
        return Math.min(res[0], res[1]);
    }
}
