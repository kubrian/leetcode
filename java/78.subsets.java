import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());
        for (int x : nums) {
            List<List<Integer>> toAdd = new ArrayList<>();
            for (List<Integer> lst : res) {
                List<Integer> newLst = new ArrayList<>(lst);
                newLst.add(x);
                toAdd.add(newLst);
            }
            res.addAll(toAdd);
        }
        return res;
    }
}
