import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int card : deck) {
            freq.put(card, freq.getOrDefault(card, 0) + 1);
        }

        int res = 0;
        for (int count : freq.values()) {
            res = gcd(res, count);
        }
        return res >= 2;

    }

    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
