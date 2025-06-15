import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Solution {
    public int[] singleNumber(int[] nums) {
        // I give up with bit manipulation
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                set.remove(num);
            } else {
                set.add(num);
            }
        }
        Iterator<Integer> it = set.iterator();
        return new int[] {it.next(), it.next()};
    }
}
