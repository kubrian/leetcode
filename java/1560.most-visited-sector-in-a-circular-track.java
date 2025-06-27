import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> mostVisited(int n, int[] rounds) {
        int[] count = new int[n];
        int start = rounds[0] - 1;
        count[start]++;
        for (int i = 1; i < rounds.length; i++) {
            int end = rounds[i] - 1;
            while (start != end) {
                start = (start + 1) % n;
                count[start]++;
            }
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, count[i]);
        }
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (count[i] == max) {
                res.add(i + 1);
            }
        }
        return res;
    }
}
