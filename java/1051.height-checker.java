import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    public int heightChecker(int[] heights) {
        Queue<Integer> queue = new PriorityQueue<>();
        for (int i = 0; i < heights.length; i++) {
            queue.add(heights[i]);
        }
        int count = 0;
        for (int i = 0; i < heights.length; i++) {
            if (queue.poll() != heights[i]) {
                count++;
            }
        }
        return count;
    }
}
