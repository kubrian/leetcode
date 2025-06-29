import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    public int maxProduct(int n) {
        Queue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        while (n > 0) {
            queue.add(n % 10);
            n /= 10;
        }
        return queue.poll() * queue.poll();
    }
}
