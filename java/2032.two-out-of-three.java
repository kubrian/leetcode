import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        Map<Integer, Integer> res = new HashMap<>();
        Set<Integer> s = new HashSet<>();
        for (int i : nums1) {
            s.add(i);
        }
        for (int x : s) {
            res.put(x, 1);
        }
        s = new HashSet<>();
        for (int i : nums2) {
            s.add(i);
        }
        for (int x : s) {
            res.put(x, res.getOrDefault(x, 0) + 1);
        }
        s = new HashSet<>();
        for (int i : nums3) {
            s.add(i);
        }
        for (int x : s) {
            res.put(x, res.getOrDefault(x, 0) + 1);
        }
        List<Integer> ans = new ArrayList<>();
        for (int x : res.keySet()) {
            if (res.get(x) >= 2) {
                ans.add(x);
            }
        }
        return ans;
    }
}
