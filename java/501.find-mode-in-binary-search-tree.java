import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Solution {
    public int[] findMode(TreeNode root) {
        // Traverse twice, once to find max, once to collect modes
        int maxFreq = 0;
        int currFreq = 0;
        int currVal = Integer.MIN_VALUE;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;
        while (curr != null || !stack.empty()) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            if (curr.val == currVal) {
                currFreq++;
            } else {
                currVal = curr.val;
                currFreq = 1;
            }
            maxFreq = Math.max(currFreq, maxFreq);
            curr = curr.right;
        }

        List<Integer> res = new ArrayList<>();
        curr = root;
        currVal = Integer.MIN_VALUE;
        currFreq = 0;
        while (curr != null || !stack.empty()) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            if (curr.val == currVal) {
                currFreq++;
            } else {
                currVal = curr.val;
                currFreq = 1;
            }
            if (currFreq == maxFreq) {
                res.add(currVal);
            }
            curr = curr.right;
        }
        return res.stream().mapToInt(Integer::intValue).toArray();
    }

}
