import java.util.ArrayList;
import java.util.List;

class Solution {
    public boolean checkPerfectNumber(int num) {
        // Get divisors
        List<Integer> divisors = new ArrayList<>();
        if (num != 1) {
            divisors.add(1);
        }
        for (int i = 2; i <= num / i; i++) {
            if (num % i == 0) {
                divisors.add(i);
                if (num / i != i) {
                    divisors.add(num / i);
                }
            }
        }
        return divisors.stream().mapToInt(Integer::intValue).sum() == num;
    }
}
