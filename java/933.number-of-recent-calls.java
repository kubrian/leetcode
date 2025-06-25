import java.util.ArrayDeque;
import java.util.Deque;

class RecentCounter {

    Deque<Integer> queue;

    public RecentCounter() {
        queue = new ArrayDeque<>();
    }
    
    public int ping(int t) {
        queue.offerLast(t);
        while (queue.peekFirst() < t - 3000) {
            queue.pollFirst();
        }
        return queue.size();
    }
}