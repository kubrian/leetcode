import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    public int lastStoneWeight(int[] stones) {
        Queue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for (int stone : stones) {
            queue.add(stone);
        }

        while (queue.size() > 1) {
            int first = queue.poll();
            int second = queue.poll();
            if (first != second) {
                queue.add(first - second);
            }
        }

        return queue.isEmpty() ? 0 : queue.poll();
    }
}
