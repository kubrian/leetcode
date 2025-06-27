class Solution {
    public int findCenter(int[][] edges) {
        int[] degrees = new int[edges.length + 1];
        for (int[] edge : edges) {
            degrees[edge[0] - 1]++;
            degrees[edge[1] - 1 ]++;
        }
        int res = -1;
        for (int i = 0; i < degrees.length; i++) {
            if (degrees[i] == edges.length) {
                res = i + 1;
                break;
            }
        }
        return res;
    }
}
