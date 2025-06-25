import java.util.Arrays;

class Solution {
    public int[] sortByBits(int[] arr) {
        return Arrays.stream(arr).boxed().sorted((a, b) -> {
            int countA = Integer.bitCount(a);
            int countB = Integer.bitCount(b);
            int cmp = Integer.compare(countA, countB);
            return cmp != 0 ? cmp : Integer.compare(a, b);
        }).mapToInt(Integer::intValue).toArray();
    }
}
