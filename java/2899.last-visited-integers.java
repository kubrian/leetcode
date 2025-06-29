import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> lastVisitedIntegers(int[] nums) {
        List<Integer> res = new ArrayList<>();
        List<Integer> seen = new ArrayList<>();
        int consec = 0;
        for (int num : nums) {
            if (num == -1) {
                consec++;
                if (consec <= seen.size()) {
                    res.add(seen.get(seen.size() - consec));
                } else {
                    res.add(-1);
                }
            } else {
                consec = 0;
                seen.add(num);
            }
        }
        return res;
    }
}
