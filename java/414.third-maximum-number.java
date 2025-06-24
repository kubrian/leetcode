import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    public int thirdMax(int[] nums) {
        Queue<Integer> q = new PriorityQueue<>();
        for (int num : nums) {
            if (q.contains(num)) {
                continue;
            }
            q.offer(num);
            if (q.size() > 3) {
                q.poll();
            }
        }
        if (q.size() < 3) {
            while (q.size() > 1) {
                q.poll();
            }
        }
        return q.peek();
    }
}
