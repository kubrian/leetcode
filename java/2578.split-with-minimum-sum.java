import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    public int splitNum(int num) {
        Queue<Integer> queue = new PriorityQueue<>();
        while (num > 0) {
            queue.add(num % 10);
            num /= 10;
        }
        int n1 = 0, n2 = 0;
        while (!queue.isEmpty()) {
            n1 = n1 * 10 + queue.poll();
            if (!queue.isEmpty()) {
                n2 = n2 * 10 + queue.poll();
            }
        }
        return n1 + n2;
    }
}
