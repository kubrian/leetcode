import java.util.List;

class Solution {
    public int rob(TreeNode root) {
        // Either rob node or don't rob node
        return getMax(search(root));
    }

    private List<Integer> search(TreeNode root) {
        // [rob root, don't rob root]
        if (root == null) {
            return List.of(0, 0);
        }
        List<Integer> left = search(root.left);
        List<Integer> right = search(root.right);

        // Rob root
        int robRoot = root.val + left.get(1) + right.get(1);

        // Don't rob root
        int dontRobRoot = getMax(left) + getMax(right);
        return List.of(robRoot, dontRobRoot);
    }

    private int getMax(List<Integer> list) {
        return list.stream().max(Integer::compare).orElse(0);
    }
}
