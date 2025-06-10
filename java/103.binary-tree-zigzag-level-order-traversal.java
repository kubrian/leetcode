import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        // BFS with a twist to be conscious of level
        List<List<Integer>> res = new ArrayList<>();
        Deque<TreeNode> currLevel = new ArrayDeque<>();
        boolean leftToRight = true;
        if (root != null) {
            currLevel.push(root);
        }
        while (!currLevel.isEmpty()) {
            List<Integer> levelNums = new ArrayList<>();
            Deque<TreeNode> nextLevel = new ArrayDeque<>();
            while (!currLevel.isEmpty()) {
                TreeNode curr = currLevel.poll();
                levelNums.add(curr.val);
                if (leftToRight) {
                    if (curr.left != null) {
                        nextLevel.push(curr.left);
                    }
                    if (curr.right != null) {
                        nextLevel.push(curr.right);
                    }
                } else {
                    if (curr.right != null) {
                        nextLevel.push(curr.right);
                    }
                    if (curr.left != null) {
                        nextLevel.push(curr.left);
                    }
                }
            }
            res.add(levelNums);
            currLevel = nextLevel;
            leftToRight = !leftToRight;
        }
        return res;
    }
}
