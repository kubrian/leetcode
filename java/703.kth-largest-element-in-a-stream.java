import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

class KthLargest {

    Queue<Integer> q;
    int k;

    public KthLargest(int k, int[] nums) {
        q = new PriorityQueue<>();
        this.k = k;
        for (int num : nums) {
            q.add(num);
            if (q.size() > k) {
                q.poll();
            }
        }
    }

    public int add(int val) {
        q.add(val);
        if (q.size() > k) {
            q.poll();
        }
        return q.peek();
    }
}