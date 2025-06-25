class Solution {
    public int findJudge(int n, int[][] trust) {
        boolean[] trustsSomeone = new boolean[n];
        int[] trustedBy = new int[n];
        for (int[] t : trust) {
            trustsSomeone[t[0] - 1] = true;
            trustedBy[t[1] - 1]++;
        }
        for (int i = 0; i < n; i++) {
            if (!trustsSomeone[i] && trustedBy[i] == n - 1) {
                return i + 1;
            }
        }
        return -1;
    }
}
