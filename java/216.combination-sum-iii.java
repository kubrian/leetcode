import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();
        dfs(k, n, 1, new ArrayList<>(), res);
        return res;
    }

    private void dfs(int k, int n, int start, List<Integer> curr, List<List<Integer>> res) {
        // Valid case
        if (k == 0 && n == 0) {
            res.add(new ArrayList<>(curr));
            return;
        }
        // Invalid cases
        if (n < 0 || k == 0 && n != 0 || start > 9) {
            return;
        }
        // Use
        curr.add(start);
        dfs(k - 1, n - start, start + 1, curr, res);
        curr.remove(curr.size() - 1);
        // Don't use
        dfs(k, n, start + 1, curr, res);
    }
}
