import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        class Pair implements Comparable<Pair> {
            int row;
            int col;
            int value;

            Pair(int row, int col) {
                this.row = row;
                this.col = col;
                this.value = matrix[row][col];
            }

            public int compareTo(Pair other) {
                return Integer.compare(this.value, other.value);
            }
        }

        int n = matrix.length;
        int count = 0;
        Queue<Pair> minHeap = new PriorityQueue<>();
        // Offer first of each row
        for (int i = 0; i < n; i++) {
            minHeap.offer(new Pair(i, 0));
        }

        Pair curr = null;
        while (count < k) {
            curr = minHeap.poll();
            count++;
            if (curr.col + 1 < n) {
                minHeap.offer(new Pair(curr.row, curr.col + 1));
            }
        }
        return curr.value;
    }
}
