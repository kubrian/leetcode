import java.util.ArrayDeque;
import java.util.Queue;

class Solution {
    public int maxDepth(TreeNode root) {
        // BFS with a twist to be conscious of level
        int height = 0;
        Queue<TreeNode> currLevel = new ArrayDeque<>();
        if (root != null) {
            currLevel.offer(root);
        }
        while (!currLevel.isEmpty()) {
            Queue<TreeNode> nextLevel = new ArrayDeque<>();
            while (!currLevel.isEmpty()) {
                TreeNode curr = currLevel.poll();
                if (curr.left != null) {
                    nextLevel.offer(curr.left);
                }
                if (curr.right != null) {
                    nextLevel.offer(curr.right);
                }
            }
            currLevel = nextLevel;
            height++;
        }
        return height;
    }
}
