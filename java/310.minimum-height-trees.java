import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        // The answers are the nodes which are furthest away from leaves
        // So calculate the distance to leaves

        // Change to adjacency list
        List<Set<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new HashSet<>());
        }
        for (int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }

        // Remove leaves until 1 or 2 nodes left
        boolean[] removedNodes = new boolean[n];
        int removed = 0;
        while (removed < n - 2) {
            List<Integer> leaves = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if (adj.get(i).size() == 1) {
                    leaves.add(i);
                }
            }
            removed += leaves.size();
            for (int i : leaves) {
                Set<Integer> currAdj = adj.get(i);
                int neighbour = currAdj.iterator().next();
                adj.get(neighbour).remove(i);
                currAdj.clear();
                removedNodes[i] = true;
            }
        }

        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (!removedNodes[i]) {
                res.add(i);
            }
        }
        return res;
    }
}
