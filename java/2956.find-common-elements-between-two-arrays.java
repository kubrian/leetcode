import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }
        for (int num : nums2) {
            set2.add(num);
        }
        int[] res = new int[2];
        for (int i = 0; i < nums1.length; i++) {
            if (set2.contains(nums1[i])) {
                res[0]++;
            }
        }
        for (int i = 0; i < nums2.length; i++) {
            if (set1.contains(nums2[i])) {
                res[1]++;
            }
        }
        return res;
    }
}
