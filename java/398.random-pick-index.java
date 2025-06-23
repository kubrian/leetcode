import java.util.Random;

class Solution {

    int[] nums;
    Random rand;

    public Solution(int[] nums) {
        this.nums = nums;
        rand = new Random();
    }

    public int pick(int target) {
        int count = 1;
        int idx = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target && rand.nextInt(count++) == 0) {
                idx = i;
            }
        }
        return idx;
    }
}
