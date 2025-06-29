class Solution {
    public boolean hasTrailingZeros(int[] nums) {
        // Same as there exists two even numbers
        boolean evenOne = false;
        for (int num : nums) {
            if (num % 2 == 0) {
                if (evenOne) {
                    return true;
                }
                evenOne = true;
            }
        }
        return false;
    }
}
