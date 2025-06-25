import java.util.ArrayDeque;
import java.util.Queue;

class Solution {
    public boolean isCousins(TreeNode root, int x, int y) {
        Queue<TreeNode> level = new ArrayDeque<>();
        level.offer(root);
        while (!level.isEmpty()) {
            int size = level.size();
            boolean xFound = false;
            boolean yFound = false;
            for (int i = 0; i < size; i++) {
                TreeNode curr = level.poll();
                // If both are child then is false
                if (curr.left != null && curr.right != null
                        && (curr.left.val == x && curr.right.val == y
                                || curr.left.val == y && curr.right.val == x)) {
                    return false;
                }
                if (curr.val == x) {
                    xFound = true;
                }
                if (curr.val == y) {
                    yFound = true;
                }
                if (curr.left != null) {
                    level.offer(curr.left);
                }
                if (curr.right != null) {
                    level.offer(curr.right);
                }
            }
            if (xFound || yFound) {
                if (xFound && yFound) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

}
