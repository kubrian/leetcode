import java.util.HashMap;
import java.util.Map;

class Solution {
    public int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> firstIndex = new HashMap<>();
        Map<Integer, Integer> freqMap = new HashMap<>();
        int maxFrequency = 0;
        int shortest = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            firstIndex.putIfAbsent(nums[i], i);
            int currFreq = freqMap.getOrDefault(nums[i], 0) + 1;
            freqMap.put(nums[i], currFreq);
            if (currFreq > maxFrequency) {
                shortest = i - firstIndex.get(nums[i]) + 1;
                maxFrequency = currFreq;
            } else if (currFreq == maxFrequency) {
                shortest = Math.min(shortest, i - firstIndex.get(nums[i]) + 1);
            }
        }
        return shortest;
    }

}
