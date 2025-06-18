import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqs = new HashMap<>();
        for (int num : nums) {
            freqs.put(num, freqs.getOrDefault(num, 0) + 1);
        }

        // Build max heap, keeping k elements max
        Queue<Integer> maxHeap = new PriorityQueue<>((a, b) -> freqs.get(a).compareTo(freqs.get(b)));
        for (int num : freqs.keySet()) {
            maxHeap.offer(num);
            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }

        // Get top k elements
        int[] res = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            res[i] = maxHeap.poll();
        }
        return res;
    }
}
