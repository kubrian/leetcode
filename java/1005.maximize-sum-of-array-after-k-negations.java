import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Queue<Integer> queue = new PriorityQueue<>();
        for (int num : nums) {
            queue.add(num);
        }

        while (k > 0) {
            int min = queue.poll();
            queue.add(-min);
            k--;
        }

        return queue.stream().mapToInt(Integer::intValue).sum();
    }
}
