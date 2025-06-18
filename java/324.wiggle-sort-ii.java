import java.util.Arrays;

class Solution {
    public void wiggleSort(int[] nums) {
        // Can definitely do without sorting but whatever
        int[] newarr = Arrays.copyOf(nums, nums.length);
        Arrays.sort(newarr);

        int idx = nums.length - 1; // Rather than track index just count
        // Fill odd first to ensure nums[0] < nums[1]
        for (int i = 1; i < nums.length; i += 2) {
            nums[i] = newarr[idx--];
        }

        for (int i = 0; i < nums.length; i += 2) {
            nums[i] = newarr[idx--];
        }
    }
}
