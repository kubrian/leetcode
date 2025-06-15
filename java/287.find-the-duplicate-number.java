class Solution {
    public int findDuplicate(int[] nums) {
        // Same as 142 if we treat nums as a directed graph

        // Edge: nums[i] -> nums[nums[i]] (not i -> nums[i])
        // Every node has exactly one outgoing edge
        // Exactly one node has at least two incoming edges, the rest having at most one.
        // There must be a cycle, and the start of the cycle is the duplicate.
        int slow = nums[0];
        int fast = nums[0];

        while (true) {
            slow = nums[slow];
            fast = nums[nums[fast]];
            if (slow == fast) {
                break;
            }
        }

        slow = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}
