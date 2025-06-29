import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    public int minimumCost(int[] nums) {
        Queue<Integer> queue = new PriorityQueue<>();
        for (int i = 1; i < nums.length; i++) {
            queue.add(nums[i]);
        }
        return nums[0] + queue.poll() + queue.poll();
    }
}
