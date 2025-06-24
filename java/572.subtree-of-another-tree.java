class Solution {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null || subRoot == null) {
            return root == subRoot;
        }
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot)
                || isSameTree(root, subRoot);
    }

    private boolean isSameTree(TreeNode x, TreeNode y) {
        if (x == null || y == null) {
            return x == y;
        }
        return (x.val == y.val) && isSameTree(x.left, y.left) && isSameTree(x.right, y.right);
    }
}
