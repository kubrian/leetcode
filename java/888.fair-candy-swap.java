import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumA = 0;
        int sumB = 0;
        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();
        for (int a : aliceSizes) {
            sumA += a;
            setA.add(a);
        }
        for (int b : bobSizes) {
            sumB += b;
            setB.add(b);
        }
        int aliceExtra = (sumA - sumB) / 2;
        int[] res = new int[2];
        for (int a : aliceSizes) {
            if (setB.contains(a - aliceExtra)) {
                res[0] = a;
                res[1] = a - aliceExtra;
                break;
            }
        }
        return res;
    }
}
