import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> res = new ArrayList<>();
        int curr = 1;
        for (int i = 0; i < n; i++) {
            res.add(curr);
            if (curr * 10 <= n) { // Add 0 behind
                curr *= 10;
            } else if (curr % 10 < 9 && curr + 1 <= n) { // Increase by 1
                curr++;
            } else { // Go to next digit
                while (curr % 10 == 9 || curr + 1 > n) {
                    curr /= 10;
                }
                curr++;
            }
        }
        return res;
    }
}
