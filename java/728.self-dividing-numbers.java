import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        // Seems like only bruteforce works?
        List<Integer> res = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            boolean isSelfDividing = true;
            int num = i;
            while (num != 0) {
                int digit = num % 10;
                if (digit == 0 || i % digit != 0) {
                    isSelfDividing = false;
                    break;
                }
                num /= 10;
            }
            if (isSelfDividing) {
                res.add(i);
            }
        }
        return res;
    }
}
