import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        Queue<Integer> queue = new PriorityQueue<>((a, b) -> Integer.compare(nums[a], nums[b]));
        for (int i = 0; i < nums.length; i++) {
            queue.add(i);
            if (queue.size() > k) {
                queue.poll();
            }
        }
        // sorting by index deals with subsequence property
        return queue.stream().sorted().mapToInt(i -> nums[i]).toArray();
    }
}
