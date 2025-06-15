import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<String> res = new ArrayList<>();
        List<TreeNode> currPath = new ArrayList<>();
        currPath.add(root);
        dfs(root, currPath, res);
        return res;
    }

    private void dfs(TreeNode root, List<TreeNode> currPath, List<String> res) {
        // At leaf, make the string
        if (root.left == null && root.right == null) {
            res.add(currPath.stream().map(node -> String.valueOf(node.val))
                    .collect(Collectors.joining("->")));
        }
        // Go left
        if (root.left != null) {
            currPath.add(root.left);
            dfs(root.left, currPath, res);
            currPath.remove(currPath.size() - 1);
        }
        // Go right
        if (root.right != null) {
            currPath.add(root.right);
            dfs(root.right, currPath, res);
            currPath.remove(currPath.size() - 1);
        }
    }
}
