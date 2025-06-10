import java.util.Stack;

class Solution {
    public boolean isValidBST(TreeNode root) {
        // Exercise for inorder traversal
        Stack<TreeNode> inorder = new Stack<>();
        TreeNode prev = null;
        while (root != null || !inorder.empty()) {
            while (root != null) {
                inorder.push(root);
                root = root.left;
            }
            // No more left child
            TreeNode curr = inorder.pop();
            if (prev != null && curr.val <= prev.val) {
                return false;
            }
            prev = curr;
            root = curr.right;
        }
        return true;
    }
}
