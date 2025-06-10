import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        Stack<Integer> nums =
                IntStream.rangeClosed(1, n).boxed().collect(Collectors.toCollection(Stack::new));
        travel(nums, k, new ArrayList<>(), res);
        return res;
    }

    private void travel(Stack<Integer> candidates, int k, List<Integer> comb,
            List<List<Integer>> res) {
        // Has required number of elements
        if (k == 0) {
            res.add(new ArrayList<>(comb));
            return;
        }
        // Invalid state
        if (k < 0 || candidates.empty()) {
            return;
        }

        // Don't use last
        int temp = candidates.pop();
        travel(candidates, k, comb, res);

        // Use last
        comb.add(temp);
        travel(candidates, k - 1, comb, res);
        comb.remove(comb.size() - 1);
        candidates.push(temp);
    }
}
