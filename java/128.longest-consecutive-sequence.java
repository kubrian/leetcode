import java.util.HashSet;
import java.util.Set;

class Solution {
    public int longestConsecutive(int[] nums) {
        // Convert to set then check for existence
        Set<Integer> allNums = new HashSet<>();
        for (int num : nums) {
            allNums.add(num);
        }

        int longest = 0;
        for (int num : nums) {
            if (allNums.contains(num)) {
                int length = 1;
                allNums.remove(num);
                // Check below
                int temp = num - 1;
                while (allNums.contains(temp)) {
                    length++;
                    allNums.remove(temp);
                    temp--;
                }
                // Check above
                temp = num + 1;
                while (allNums.contains(temp)) {
                    length++;
                    allNums.remove(temp);
                    temp++;
                }
                // Update longest
                longest = Math.max(longest, length);
            }
        }

        return longest;
    }
}
