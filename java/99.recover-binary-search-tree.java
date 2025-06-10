import java.util.Stack;

class Solution {
    public void recoverTree(TreeNode root) {
        // Exercise for inorder traversal
        Stack<TreeNode> inorder = new Stack<>();
        TreeNode prev = null;
        TreeNode first = null;
        TreeNode second = null;
        while (root != null || !inorder.empty()) {
            while (root != null) {
                inorder.push(root);
                root = root.left;
            }
            // No more left child
            TreeNode curr = inorder.pop();
            if (prev != null && curr.val <= prev.val) {
                if (first == null) {
                    first = prev;
                }
                second = curr;
            }
            prev = curr;
            root = curr.right;
        }
        int temp = first.val;
        first.val = second.val;
        second.val = temp;
    }
}
