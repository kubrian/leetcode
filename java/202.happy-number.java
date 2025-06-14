import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();
        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            int newN = 0;
            while (n != 0) {
                newN += (n % 10) * (n % 10);
                n /= 10;
            }
            n = newN;
        }
        return n == 1;
    }
}
