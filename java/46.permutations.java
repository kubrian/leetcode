import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        travel(Arrays.stream(nums).boxed().collect(Collectors.toList()), new ArrayList<>(), res);
        return res;
    }

    public void travel(List<Integer> nums, List<Integer> perm, List<List<Integer>> res) {
        if (nums.size() == 0) {
            res.add(new ArrayList<>(perm));
            return;
        }
        for (int i = 0; i < nums.size(); i++) {
            perm.add(nums.remove(i));
            travel(nums, perm, res);
            nums.add(i, perm.remove(perm.size() - 1));
        }
    }
}
