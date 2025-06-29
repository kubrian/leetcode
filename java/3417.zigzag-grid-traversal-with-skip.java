import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> zigzagTraversal(int[][] grid) {
        List<Integer> res = new ArrayList<>();
        int m = grid.length;
        int n = grid[0].length;
        boolean skip = false;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (!skip) {
                    if (i % 2 == 0) {
                        res.add(grid[i][j]);
                    } else {
                        res.add(grid[i][n - 1 - j]);

                    }
                }
                skip = !skip;
            }
        }
        return res;
    }
}
