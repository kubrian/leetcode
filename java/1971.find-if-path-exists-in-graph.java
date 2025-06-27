class Solution {

    int[] parent;

    public boolean validPath(int n, int[][] edges, int source, int destination) {
        // UFDS practice
        parent = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
        for (int[] edge : edges) {
            union(edge[0], edge[1]);
        }
        return find(source) == find(destination);
    }

    private int find(int x) {
        if (parent[x] == x)
            return x;
        parent[x] = find(parent[x]);
        return parent[x];
    }

    private void union(int x, int y) {
        parent[find(x)] = find(y);
    }
}
