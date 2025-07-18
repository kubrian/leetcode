import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> res = new ArrayList<>();
        int num = 0;
        for (int i = 0; i < nums.length; i++) {
            // Remainder / x persists with mod x
            num = ((num << 1) + nums[i]) % 5;
            res.add(num == 0);
        }
        return res;
    }
}
