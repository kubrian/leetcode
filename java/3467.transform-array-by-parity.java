class Solution {
    public int[] transformArray(int[] nums) {
        int even = 0;
        for (int x : nums) {
            if (x % 2 == 0) {
                even++;
            }
        }
        int[] res = new int[nums.length];
        for (int i = even; i < nums.length; i++) {
            res[i] = 1;
        }
        return res;
    }
}
