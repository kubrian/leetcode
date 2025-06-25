import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        k = k % (m * n);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            res.add(new ArrayList<>());
            for (int j = 0; j < n; j++) {
                int index = (i * n + j - k + m * n) % (m * n);
                res.get(i).add(grid[index / n][index % n]);
            }
        }
        return res;
    }
}
