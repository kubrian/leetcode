import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);
        int[] bestLength = new int[nums.length]; // Length of best subset up to nums[i]
        int[] previousIndex = new int[nums.length]; // Previous number in the set for nums[i]
        Arrays.fill(bestLength, 1); // At least 1 number
        Arrays.fill(previousIndex, -1); // No previous index

        int maxLength = 1;
        int bestIndex = 0;
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] % nums[j] == 0 && bestLength[i] < bestLength[j] + 1) {
                    bestLength[i] = bestLength[j] + 1;
                    previousIndex[i] = j;
                }
            }
            if (bestLength[i] > maxLength) {
                maxLength = bestLength[i];
                bestIndex = i;
            }
        }

        // Reconstruct set
        List<Integer> res = new ArrayList<>();
        while (bestIndex != -1) {
            res.add(nums[bestIndex]);
            bestIndex = previousIndex[bestIndex];
        }
        return res;

    }
}
