import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);

        List<List<Integer>> res = new ArrayList<>();
        for (int a = 0; a < nums.length;) {
            for (int b = a + 1; b < nums.length;) {
                int c = b + 1;
                int d = nums.length - 1;
                while (c < d) {
                    long sum = (long) nums[a] + nums[b] + nums[c] + nums[d];
                    if (sum == target) {
                        // Same, so add to list
                        res.add(List.of(nums[a], nums[b], nums[c], nums[d]));
                        // Decrease d
                        int temp = nums[d--];
                        while (c < d && nums[d] == temp) {
                            d--;
                        }
                        // Increase c
                        while (c < d && (long) nums[a] + nums[b] + nums[c] + nums[d] < target) {
                            c++;
                        }
                    } else if (sum < target) {
                        // Sum too small, so increase c
                        while (c < d && (long) nums[a] + nums[b] + nums[c] + nums[d] < target) {
                            c++;
                        }
                    } else {
                        // Sum too large, so decrease d
                        while (c < d && (long) nums[a] + nums[b] + nums[c] + nums[d] > target) {
                            d--;
                        }
                    }
                }
                // Increase b to next unique number.
                int temp = nums[b++];
                while (b < nums.length && nums[b] == temp) {
                    b++;
                }
            }
            // Increase a to next unique number
            int temp = nums[a++];
            while (a < nums.length && nums[a] == temp) {
                a++;
            }
        }
        return res;
    }
}