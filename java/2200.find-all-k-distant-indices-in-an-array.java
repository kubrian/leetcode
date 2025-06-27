import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        Set<Integer> res = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == key) {
                for (int j = i - k; j <= i + k; j++) {
                    if (j >= 0 && j < nums.length) {
                        res.add(j);
                    }
                }
            }
        }
        return new ArrayList<>(res);
    }
}
