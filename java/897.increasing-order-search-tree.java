class Solution {
    public TreeNode increasingBST(TreeNode root) {
        return search(root, null);
    }

    private TreeNode search(TreeNode root, TreeNode last) {
        if (root == null) {
            return last;
        }
        TreeNode res = search(root.left, root);
        root.left = null;
        root.right = search(root.right, last);
        return res;
    }
}
