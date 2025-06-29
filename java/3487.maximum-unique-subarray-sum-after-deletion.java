import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

class Solution {
    public int maxSum(int[] nums) {
        Set<Integer> set = new TreeSet<>(Collections.reverseOrder());
        for (int x : nums) {
            set.add(x);
        }
        boolean added = false;
        int sum = 0;
        for (int x : set) {
            if (!added || x > 0) {
                sum += x;
                added = true;
            }
        }
        return sum;
    }
}
