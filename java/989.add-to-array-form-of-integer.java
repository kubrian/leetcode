import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        Stack<Integer> stack = new Stack<>();
        int carry = 0;
        for (int i = num.length - 1; i >= 0 || carry > 0 || k > 0; i--) {
            int curr = carry + k % 10;
            if (i >= 0) {
                curr += num[i];
            }
            k = k / 10;
            carry = curr / 10;
            curr = curr % 10;
            stack.push(curr);
        }
        List<Integer> res = new ArrayList<>();
        while (!stack.isEmpty()) {
            res.add(stack.pop());
        }
        return res;
    }
}
