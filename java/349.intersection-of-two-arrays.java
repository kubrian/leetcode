import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }
        Set<Integer> res = new HashSet<>();
        for (int num : nums2) {
            if (set1.contains(num)) {
                res.add(num);
            }
        }
        return res.stream().mapToInt(i -> i).toArray();

    }
}
