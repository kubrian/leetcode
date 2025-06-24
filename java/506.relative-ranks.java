import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    public String[] findRelativeRanks(int[] score) {
        class Score implements Comparable<Score> {
            int val;
            int index;

            Score(int index) {
                this.val = score[index];
                this.index = index;
            }

            public int compareTo(Score other) {
                // this is before other if other.val is smaller than this.val
                return Integer.compare(other.val, this.val);
            }

        }

        Queue<Score> heap = new PriorityQueue<>();
        int n = score.length;
        String[] res = new String[n];

        for (int i = 0; i < n; i++) {
            heap.offer(new Score(i));
        }

        for (int i = 0; i < n; i++) {
            Score curr = heap.poll();
            if (i == 0) {
                res[curr.index] = "Gold Medal";
            } else if (i == 1) {
                res[curr.index] = "Silver Medal";
            } else if (i == 2) {
                res[curr.index] = "Bronze Medal";
            } else {
                res[curr.index] = Integer.toString(i + 1);
            }
        }

        return res;
    }
}
