import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {

        class Pair implements Comparable<Pair> {
            int i;
            int j;
            int sum;

            Pair(int i, int j) {
                this.i = i;
                this.j = j;
                this.sum = nums1[i] + nums2[j];
            }

            public int compareTo(Pair other) {
                return Integer.compare(this.sum, other.sum);
            }
        }

        // Use a heap to handle the k smallest
        List<List<Integer>> res = new ArrayList<>();
        Queue<Pair> heap = new PriorityQueue<>();

        // Initialize using k pairs of nums1
        for (int i = 0; i < Math.min(k, nums1.length); i++) {
            heap.offer(new Pair(i, 0));
        }

        while (res.size() < k) {
            Pair curr = heap.poll();
            res.add(List.of(nums1[curr.i], nums2[curr.j]));
            // Advance j
            if (curr.j + 1 < nums2.length) {
                heap.offer(new Pair(curr.i, curr.j + 1));
            }
        }

        return res;
    }
}
