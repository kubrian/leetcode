import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        // BFS with a twist to be conscious of level
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> currLevel = new ArrayDeque<>();
        if (root != null) {
            currLevel.offer(root);
        }
        while (!currLevel.isEmpty()) {
            List<Integer> levelNums = new ArrayList<>();
            Queue<TreeNode> nextLevel = new ArrayDeque<>();
            while (!currLevel.isEmpty()) {
                TreeNode curr = currLevel.poll();
                levelNums.add(curr.val);
                if (curr.left != null) {
                    nextLevel.offer(curr.left);
                }
                if (curr.right != null) {
                    nextLevel.offer(curr.right);
                }
            }
            res.add(0, levelNums);
            currLevel = nextLevel;
        }
        return res;
    }
}
