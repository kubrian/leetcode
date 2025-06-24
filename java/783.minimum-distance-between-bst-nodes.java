import java.util.Stack;

class Solution {
    public int minDiffInBST(TreeNode root) {
        // Given at least two nodes
        int minDiff = Integer.MAX_VALUE;
        TreeNode prev = null;
        Stack<TreeNode> inorder = new Stack<>();
        while (root != null || !inorder.empty()) {
            while (root != null) {
                inorder.push(root);
                root = root.left;
            }
            root = inorder.pop();
            if (prev != null) {
                minDiff = Math.min(minDiff, root.val - prev.val);
            }
            prev = root;
            root = root.right;
        }
        return minDiff;
    }
}
