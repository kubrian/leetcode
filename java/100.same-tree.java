import java.util.Stack;

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // Exercise for inorder traversal
        Stack<TreeNode> inorder = new Stack<>();
        while ((p != null && q != null) || !inorder.empty()) {
            // Push p then q
            while ((p != null && q != null)) {
                inorder.push(p);
                inorder.push(q);
                p = p.left;
                q = q.left;
            }
            // Both must be null
            if (p != null || q != null) {
                return false;
            }
            q = inorder.pop();
            p = inorder.pop();
            if (p.val != q.val) {
                return false;
            }
            // Move to right
            p = p.right;
            q = q.right;
        }
        return (p == null && q == null);
    }
}
