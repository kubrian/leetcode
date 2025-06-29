import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public int[] circularGameLosers(int n, int k) {
        Set<Integer> set = new HashSet<>();
        int curr = 0;
        while (!set.contains(curr)) {
            set.add(curr);
            curr = (curr + k * set.size()) % n;
        }
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (!set.contains(i)) {
                res.add(i + 1);
            }
        }
        return res.stream().mapToInt(i -> i).toArray();

    }
}
