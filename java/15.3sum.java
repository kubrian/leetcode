import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        int temp;
        for (int i = 0; i < nums.length && nums[i] <= 0;) {
            // For each value of i -- check all pairs of (j, k)?
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k && nums[k] >= 0) {
                // If find number, shift k until number actually decreases
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    List<Integer> currList = new ArrayList<>();
                    currList.add(nums[i]);
                    currList.add(nums[j]);
                    currList.add(nums[k]);
                    res.add(currList);
                    temp = nums[k];
                    while (k > 0 && nums[k] == temp) {
                        k--;
                    }
                    while (j < k && nums[i] + nums[j] + nums[k] < 0) {
                        j++;
                    }
                } else if (sum < 0) { // Too small, increase j
                    while (j < k && nums[i] + nums[j] + nums[k] < 0) {
                        j++;
                    }
                } else { // Too large, decrease k
                    while (k > 0 && nums[i] + nums[j] + nums[k] > 0) {
                        k--;
                    }
                }
            }
            temp = nums[i];
            while (i < nums.length && nums[i] == temp) {
                i++;
            }
        }
        return res;
    }
}