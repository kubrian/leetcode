import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        while (root != null || !stack.empty()) {
            while (root != null) {
                res.add(0, root.val);
                stack.push(root);
                root = root.right;
            }
            root = stack.pop().left;
        }
        return res;
    }
}
