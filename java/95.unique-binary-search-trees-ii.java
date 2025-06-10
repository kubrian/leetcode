import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<TreeNode> generateTrees(int n) {
        List<TreeNode>[] res = new List[n + 1];

        // For n = 0, it is a null tree
        res[0] = new ArrayList<>();
        res[0].add(null);

        // Across tree size
        for (int i = 1; i <= n; i++) {
            res[i] = new ArrayList<>();
            // Across root choice
            for (int r = 1; r <= i; r++) {
                // There are r-1 nodes on the left and i-r nodes on the right
                // Iterate through every combination
                for (TreeNode leftSubtree : res[r - 1]) {
                    for (TreeNode rightSubtree : res[i - r]) {
                        // Lowest value for right subtree is r + 1 instead of 1
                        TreeNode root = new TreeNode(r);
                        root.left = cloneAndOffset(leftSubtree, 0);
                        root.right = cloneAndOffset(rightSubtree, r);
                        res[i].add(root);
                    }
                }
            }
        }
        return res[n];
    }

    private TreeNode cloneAndOffset(TreeNode x, int offset) {
        if (x == null) {
            return null;
        }
        return new TreeNode(x.val + offset, cloneAndOffset(x.left, offset),
                cloneAndOffset(x.right, offset));
    }
}
