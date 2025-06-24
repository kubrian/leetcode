import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> level = new ArrayDeque<>();
        List<Double> res = new ArrayList<>();
        level.offer(root);
        while (!level.isEmpty()) {
            double sum = 0;
            int levelSize = level.size();
            for (int i = 0; i < levelSize; i++) {
                TreeNode curr = level.poll();
                sum += curr.val;
                if (curr.left != null) {
                    level.offer(curr.left);
                }
                if (curr.right != null) {
                    level.offer(curr.right);
                }
            }
            res.add(sum / levelSize);
        }
        return res;
    }
}
