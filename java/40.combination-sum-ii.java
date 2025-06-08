import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        travel(candidates, target, 0, new ArrayList<>(), res);
        return res;
    }

    public void travel(int[] candidates, int target, int index, List<Integer> comb,
            List<List<Integer>> res) {
        if (target == 0) {
            res.add(new ArrayList<>(comb));
            return;
        }
        if (target < 0 || index >= candidates.length) {
            return;
        }
        int curr = candidates[index];
        comb.add(curr);
        travel(candidates, target - curr, index + 1, comb, res);
        comb.remove(comb.size() - 1);
        while (index + 1 < candidates.length && candidates[index] == candidates[index + 1]) {
            index++;
        }
        travel(candidates, target, index + 1, comb, res);
    }
}
