class Solution {
    public int majorityElement(int[] nums) {
        // Assume current element is majority and switch out if it isn't
        // The true majority will eventually be set
        // Suppose the majority gets swapped out, means it is currently less than 1/2 of all encountered elements, it will be >1/2 later (there exists, and there exists many)
        int candidate = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (candidate == nums[i]) {
                count++;
            } else {
                count--;
                if (count == 0) {
                    candidate = nums[i];
                    count = 1;
                }
            }
        }
        return candidate;
    }
}
