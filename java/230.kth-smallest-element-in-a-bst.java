import java.util.Stack;

class Solution {
    public int kthSmallest(TreeNode root, int k) {
        // The best might be to store the rank within the node, so that we can choose either branch.
        // But we don't have that, so inorder it is
        int count = 0;
        Stack<TreeNode> stack = new Stack<>();
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            count++;
            if (count == k) {
                return root.val;
            }
            root = root.right;
        }
        return -1;
    }
}
