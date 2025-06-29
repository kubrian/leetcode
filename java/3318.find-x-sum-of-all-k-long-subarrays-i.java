import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        int[] res = new int[nums.length + 1 - k];
        // Setup for first subarray
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < k; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        class Pair implements Comparable<Pair> {
            int val;
            int count;

            Pair(int val, int count) {
                this.val = val;
                this.count = count;
            }

            public int compareTo(Pair o) {
                int cmp = Integer.compare(o.count, this.count);
                if (cmp != 0) {
                    return cmp;
                }
                return Integer.compare(o.val, this.val);
            };
        }

        for (int i = 0; i < nums.length - k + 1; i++) {
            // Calculate for current set
            Queue<Pair> pq = new PriorityQueue<>();
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                pq.add(new Pair(entry.getKey(), entry.getValue()));
            }

            int count = 0;
            while (count < x) {
                if (pq.isEmpty()) {
                    break;
                }
                Pair p = pq.poll();
                res[i] += p.val * p.count;
                count++;
            }

            if (i == nums.length - k) {
                break;
            }
            // Update map
            map.put(nums[i], map.get(nums[i]) - 1); // Remove i
            map.put(nums[i + k], map.getOrDefault(nums[i + k], 0) + 1); // Add i+k
        }

        return res;
    }
}
