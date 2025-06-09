class Solution {
    public void sortColors(int[] nums) {
        // 3 partitions (<1, 1, >1)
        int l = 0; // Left end of middle partition
        int r = nums.length - 1; // Right end of middle partition
        for (int i = 0; i <= r; i++) {
            if (nums[i] == 0) {
                swap(nums, i, l++);
            } else if (nums[i] == 2) {
                swap(nums, i--, r--);
            }
        }
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
