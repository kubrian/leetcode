import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] arrayRankTransform(int[] arr) {
        // Sort -> map -> place
        int[] sorted = arr.clone();
        Arrays.sort(sorted);
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < sorted.length; i++) {
            map.putIfAbsent(sorted[i], map.size() + 1);
        }
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = map.get(arr[i]);
        }
        return res;
    }
}
