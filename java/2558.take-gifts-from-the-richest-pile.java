import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    public long pickGifts(int[] gifts, int k) {
        Queue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for (int gift : gifts) {
            queue.add(gift);
        }
        for (int i = 0; i < k; i++) {
            int gift = queue.poll();
            queue.add((int) Math.sqrt(gift));
        }
        long sum = 0;
        while (!queue.isEmpty()) {
            sum += queue.poll();
        }
        return sum;
    }
}
