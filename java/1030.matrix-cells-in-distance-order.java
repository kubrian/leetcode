import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        Queue<int[]> res = new PriorityQueue<>((a, b) -> {
            int distA = Math.abs(a[0] - rCenter) + Math.abs(a[1] - cCenter);
            int distB = Math.abs(b[0] - rCenter) + Math.abs(b[1] - cCenter);
            return Integer.compare(distA, distB);
        });

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                res.offer(new int[] { i, j });
            }
        }

        int[][] ans = new int[rows * cols][2];
        for (int i = 0; i < rows * cols; i++) {
            ans[i] = res.poll();
        }
        return ans;
    }
}
