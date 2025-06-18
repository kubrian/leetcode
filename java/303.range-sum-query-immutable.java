class NumArray {

    int[] upTo;

    public NumArray(int[] nums) {
        upTo = new int[nums.length];
        upTo[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            upTo[i] = nums[i] + upTo[i - 1];
        }
    }

    public int sumRange(int left, int right) {
        if (left == 0) {
            return upTo[right];
        }
        return upTo[right] - upTo[left - 1];
    }
}
