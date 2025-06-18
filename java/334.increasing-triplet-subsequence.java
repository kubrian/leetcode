class Solution {
    public boolean increasingTriplet(int[] nums) {
        // Existence and not actual index
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num <= smallest) {
                smallest = num;
            } else if (num <= secondSmallest) {
                secondSmallest = num;
            } else {
                return true;
            }
        }
        return false;
    }
}
