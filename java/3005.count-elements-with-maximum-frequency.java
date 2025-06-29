import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        Arrays.stream(nums).forEach(num -> map.put(num, map.getOrDefault(num, 0) + 1));
        int maxFreq = map.values().stream().mapToInt(Integer::valueOf).max().getAsInt();
        int freqOfMax = (int) map.values().stream().filter(num -> num == maxFreq).count();
        return freqOfMax * maxFreq;
    }
}
