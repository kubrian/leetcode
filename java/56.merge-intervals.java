import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        List<int[]> res = new ArrayList<>();
        for (int[] interval : intervals) {
            int start = interval[0];
            int end = interval[1];
            if (res.size() == 0 || res.get(res.size() - 1)[1] < start) {
                res.add(interval);
            } else {
                res.get(res.size() - 1)[1] = Math.max(res.get(res.size() - 1)[1], end);
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}
