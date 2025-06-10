import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> nodeStack = new Stack<>();
        List<Integer> res = new ArrayList<>();
        while (root != null || !nodeStack.empty()) {
            // Left before this -> push this and move to left
            while (root != null) {
                nodeStack.push(root);
                root = root.left;
            }
            // No more left -> get last node and go right before up.
            TreeNode curr = nodeStack.pop();
            res.add(curr.val);
            root = curr.right;
        }
        return res;
    }
}
