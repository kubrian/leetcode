class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return buildTree(inorder, postorder, 0, inorder.length, 0, postorder.length);
    }

    private TreeNode buildTree(int[] inorder, int[] postorder, int inFrom, int inTo, int postFrom,
            int postTo) {
        if (inFrom == inTo) {
            return null;
        }
        int rootVal = postorder[postTo - 1];
        TreeNode root = new TreeNode(rootVal);
        int i = 0;
        while (inorder[inFrom + i] != rootVal) {
            i++;
        }
        root.left = buildTree(inorder, postorder, inFrom, inFrom + i, postFrom, postFrom + i);
        root.right = buildTree(inorder, postorder, inFrom + i + 1, inTo, postFrom + i, postTo - 1);
        return root;
    }
}
