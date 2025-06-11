class Solution {
    public int singleNumber(int[] nums) {
        // Can use 2 variables to track number of occurrences
        int once = 0;
        int twice = 0;

        for (int num : nums) {
            once = (once ^ num) & ~twice; // Add, but only if not in twice!
            twice = (twice ^ num) & ~once; // Add, but only if not in once!
        }

        return once;
    }
}
