import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    public int maxSum(int[] nums) {
        Map<Integer, Queue<Integer>> map = new HashMap<>();
        for (int num : nums) {
            int copy = num;
            int k = 0;
            while (num > 0) {
                k = Math.max(num % 10, k);
                num /= 10;
            }
            map.computeIfAbsent(k, x -> new PriorityQueue<>()).offer(copy);
            if (map.get(k).size() > 2) {
                map.get(k).poll();
            }
        }

        int max = -1;
        for (Queue<Integer> set : map.values()) {
            if (set.size() >= 2) {
                max = Math.max(max, set.poll() + set.poll());
            }
        }
        return max;
    }
}
