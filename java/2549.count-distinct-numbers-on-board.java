import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

class Solution {
    public int distinctIntegers(int n) {
        Set<Integer> set = new HashSet<>();
        set.add(n);
        Queue<Integer> queue = new LinkedList<>();
        queue.add(n);
        while (!queue.isEmpty()) {
            int curr = queue.poll();
            for (int i = 2; i < curr; i++) {
                if (!set.contains(i)) {
                    set.add(i);
                    queue.add(i);
                }
            }
        }
        return set.size();
    }
}
