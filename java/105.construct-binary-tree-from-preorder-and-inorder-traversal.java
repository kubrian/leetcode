class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTree(preorder, inorder, 0, preorder.length, 0, inorder.length);
    }

    private TreeNode buildTree(int[] preorder, int[] inorder, int preFrom, int preTo, int inFrom,
            int inTo) {
        if (inFrom == inTo) {
            return null;
        }
        int rootVal = preorder[preFrom];
        TreeNode root = new TreeNode(rootVal);
        int i = 0;
        while (inorder[inFrom + i] != rootVal) {
            i++;
        }
        root.left = buildTree(preorder, inorder, preFrom + 1, preFrom + i + 1, inFrom, inFrom + i);
        root.right = buildTree(preorder, inorder, preFrom + i + 1, preTo, inFrom + i + 1, inTo);
        return root;
    }
}
