class Solution {
    public int[] buildArray(int[] nums) {
        // follow instructions
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }        
        return ans;
    }
}
