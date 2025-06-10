import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        travel(nums, 0, new ArrayList<>(), res);
        return res;
    }

    private void travel(int[] nums, int index, List<Integer> comb, List<List<Integer>> res) {
        if (index == nums.length) {
            res.add(new ArrayList<>(comb));
            return;
        }
        // Use
        comb.add(nums[index]);
        travel(nums, index + 1, comb, res);
        comb.remove(comb.size() - 1);
        
        // Not use
        while (index + 1 < nums.length && nums[index] == nums[index + 1]) {
            index++;
        }
        travel(nums, index + 1, comb, res);
    }
}
