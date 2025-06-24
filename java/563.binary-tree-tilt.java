class Solution {
    int sum = 0;

    public int findTilt(TreeNode root) {
        visit(root);
        return sum;
    }

    private int visit(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = visit(root.left);
        int right = visit(root.right);
        sum += Math.abs(right - left);
        return left + right + root.val;
    }
}
