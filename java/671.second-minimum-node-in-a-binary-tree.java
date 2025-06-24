class Solution {
    public int findSecondMinimumValue(TreeNode root) {
        // No child
        if (root.left == null) {
            return -1;
        }
        // Two child
        // Search if same, else must be diff, and root will be the min
        int left = root.val == root.left.val ? findSecondMinimumValue(root.left) : root.left.val;
        int right =
                root.val == root.right.val ? findSecondMinimumValue(root.right) : root.right.val;
        // Take the smallest non -1 answer
        return left != -1 && right != -1 ? Math.min(left, right) : Math.max(left, right);
    }
}
