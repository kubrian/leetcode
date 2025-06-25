import java.util.HashMap;
import java.util.Map;

class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        class Pair {
            int a;
            int b;

            public Pair(int a, int b) {
                this.a = a;
                this.b = b;
            }

            @Override
            public boolean equals(Object o) {
                if (this == o)
                    return true;
                if (!(o instanceof Pair)) {
                    return false;
                }
                Pair pair = (Pair) o;
                return a == pair.a && b == pair.b || a == pair.b && b == pair.a;
            }

            @Override
            public int hashCode() {
                return a + b;
            }
        }
        Map<Pair, Integer> freq = new HashMap<>();
        for (int[] domino : dominoes) {
            Pair key = new Pair(domino[0], domino[1]);
            freq.put(key, freq.getOrDefault(key, 0) + 1);
        }

        int res = 0;
        for (int value : freq.values()) {
            res += value * (value - 1) / 2;
        }
        return res;
    }
}
