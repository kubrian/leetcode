class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // Just use recursion...
        if (root == null || root == p || root == q) {
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        // Both side non-empty -> this is LCA
        if (left != null && right != null) {
            return root;
        }
        // Else, its the non-empty one
        return left != null ? left : right;
    }

}
