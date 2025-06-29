class Solution {
    public int[] minCosts(int[] cost) {
        int[] res = new int[cost.length];
        int min = cost[0];
        for (int i = 0; i < res.length; i++) {
            min = Math.min(min, cost[i]); // Min cost applies to the rest of the line
            res[i] = min;
        }
        return res;
    }
}
