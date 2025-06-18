// Idea is to do both update and sumRange in log(n) time.
// Nodes store [l, r] sum, and have left and right child of [l, m], [m + 1, r]
// update finds the i-th node and updates upwards
// sumRange finds the necessary nodes.

import java.util.Stack;

class SegmentNode {
    int leftIndex;
    int rightIndex;
    int sum;
    SegmentNode left;
    SegmentNode right;

    public SegmentNode(int leftIndex, int rightIndex) {
        this.leftIndex = leftIndex;
        this.rightIndex = rightIndex;
    }
}


class NumArray {

    SegmentNode root;

    public NumArray(int[] nums) {
        root = buildTree(nums, 0, nums.length - 1);
    }

    public void update(int index, int val) {
        Stack<SegmentNode> parents = new Stack<>();
        SegmentNode curr = root;
        // Go to the specific node
        while (curr.leftIndex != curr.rightIndex) {
            parents.push(curr);
            int midIndex = curr.leftIndex + (curr.rightIndex - curr.leftIndex) / 2;
            if (index <= midIndex) {
                curr = curr.left;
            } else {
                curr = curr.right;
            }
        }
        curr.sum = val;
        // Update parents
        while (!parents.isEmpty()) {
            curr = parents.pop();
            curr.sum = curr.left.sum + curr.right.sum;
        }
    }

    public int sumRange(int left, int right) {
        return sumRange(root, left, right);
    }

    private SegmentNode buildTree(int[] nums, int left, int right) {
        // Build node
        SegmentNode node = new SegmentNode(left, right);
        if (left == right) {
            node.sum = nums[left];
            return node;
        }
        // If range is more than 1. There must always be 2 children [e.g. [0,1] -> [0,0], [1,1]]
        int mid = left + (right - left) / 2;
        node.left = buildTree(nums, left, mid);
        node.right = buildTree(nums, mid + 1, right);
        node.sum = node.left.sum + node.right.sum;
        return node;
    }

    private int sumRange(SegmentNode root, int left, int right) {
        // Exact match
        if (root.leftIndex == left && root.rightIndex == right) {
            return root.sum;
        }
        // Partial match
        int mid = root.left.rightIndex;
        // No need right
        if (right <= mid) {
            return sumRange(root.left, left, right);
        }
        // No need left
        if (left >= mid + 1) {
            return sumRange(root.right, left, right);
        }
        // Need both
        return sumRange(root.left, left, mid) + sumRange(root.right, mid + 1, right);
    }
}
