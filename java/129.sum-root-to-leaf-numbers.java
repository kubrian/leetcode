class Solution {
    public int sumNumbers(TreeNode root) {
        return dfsSum(root, 0, 0);
    }

    private int dfsSum(TreeNode root, int curr, int sum) {
        if (root == null) {
            return 0;
        }
        curr = curr * 10 + root.val;
        if (root.left == null && root.right == null) {
            return sum + curr;
        }
        return dfsSum(root.left, curr, sum) + dfsSum(root.right, curr, sum);
    }
}
