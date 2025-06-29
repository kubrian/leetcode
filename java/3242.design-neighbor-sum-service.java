import java.util.HashMap;
import java.util.Map;

class NeighborSum {

    Map<Integer, Integer> nSum = new HashMap<>();
    Map<Integer, Integer> dSum = new HashMap<>();

    public NeighborSum(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                int n = 0;
                int d = 0;
                for (int k = -1; k <= 1; k++) {
                    for (int l = -1; l <= 1; l++) {
                        if ((k == 0 && l == 0) || i + k < 0 || i + k >= grid.length || j + l < 0
                                || j + l >= grid.length) {
                            continue;
                        } else if ((k + l) % 2 == 0) {
                            d += grid[i + k][j + l];
                        } else {
                            n += grid[i + k][j + l];
                        }
                    }
                }
                nSum.put(grid[i][j], n);
                dSum.put(grid[i][j], d);
            }
        }
    }

    public int adjacentSum(int value) {
        return nSum.getOrDefault(value, 0);
    }

    public int diagonalSum(int value) {
        return dSum.getOrDefault(value, 0);
    }
}
