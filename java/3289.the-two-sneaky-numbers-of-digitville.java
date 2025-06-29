import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        boolean[] seen = new boolean[nums.length - 2];
        List<Integer> res = new ArrayList<>();
        for (int num : nums) {
            if (seen[num]) {
                res.add(num);
            } else {
                seen[num] = true;
            }
        }
        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}
