import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    public int deleteGreatestValue(int[][] grid) {
        Queue<Integer>[] queues = new PriorityQueue[grid.length];
        for (int i = 0; i < grid.length; i++) {
            queues[i] = new PriorityQueue<>(Collections.reverseOrder());
            for (int j = 0; j < grid[0].length; j++) {
                queues[i].add(grid[i][j]);
            }
        }
        int res = 0;
        for (int i = 0; i < grid[0].length; i++) {
            int max = 0;
            for (int j = 0; j < grid.length; j++) {
                max = Math.max(max, queues[j].poll());
            }
            res += max;
        }
        return res;
    }
}
