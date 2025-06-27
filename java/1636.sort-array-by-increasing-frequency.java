import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
        list.sort((a, b) -> {
            int cmp = Integer.compare(map.get(a), map.get(b));
            return cmp != 0 ? cmp : Integer.compare(b, a);
        });

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
