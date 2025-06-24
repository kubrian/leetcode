class Solution {
    // First time using class var since ints are immutable...
    int res = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        depth(root);
        return res;
    }

    private int depth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = depth(root.left);
        int right = depth(root.right);
        res = Math.max(res, left + right);
        return 1 + Math.max(left, right);
    }
}
