class Solution {
    public int countNodes(TreeNode root) {
        // Subtrees of complete binary trees are also complete binary trees
        if (root == null) {
            return 0;
        }
        int l = leftHeight(root);
        int r = rightHeight(root);
        // This is the "better than O(n)" part as either subtree will be complete
        if (l == r) {
            // 2 ** h - 1
            return (1 << l) - 1;
        }
        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    private int leftHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + leftHeight(root.left);
    }

    private int rightHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + rightHeight(root.right);
    }
}
