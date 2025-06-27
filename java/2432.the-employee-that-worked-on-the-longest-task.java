class Solution {
    public int hardestWorker(int n, int[][] logs) {
        int prev = logs[0][1];
        int maxTime = logs[0][1];
        int res = logs[0][0];
        for (int i = 1; i < logs.length; i++) {
            if (logs[i][1] - prev > maxTime) {
                maxTime = logs[i][1] - prev;
                res = logs[i][0];
            } else if (logs[i][1] - prev == maxTime) {
                res = Math.min(res, logs[i][0]);
            }
            prev = logs[i][1];
        }
        return res;
    }
}
