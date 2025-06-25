class Solution {
    public int sumRootToLeaf(TreeNode root) {
        return search(root, 0);
    }

    private int search(TreeNode root, int curr) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return curr * 2 + root.val;
        }
        int left = search(root.left, curr * 2 + root.val);
        int right = search(root.right, curr * 2 + root.val);
        return left + right;
    }
}
