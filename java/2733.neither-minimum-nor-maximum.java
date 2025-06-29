import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    public int findNonMinOrMax(int[] nums) {
        if (nums.length < 3) {
            return -1;
        }
        Queue<Integer> queue = new PriorityQueue<>();
        for (int i = 0; i < 3; i++) {
            queue.add(nums[i]);
        }
        queue.poll();
        return queue.poll();
    }
}
