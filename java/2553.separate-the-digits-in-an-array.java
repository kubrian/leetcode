import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Solution {
    public int[] separateDigits(int[] nums) {
        Queue<Integer> queue = new LinkedList<>();
        for (int num : nums) {
            Stack<Integer> stack = new Stack<>();
            while (num > 0) {
                stack.push(num % 10);
                num /= 10;
            }
            while (!stack.isEmpty()) {
                queue.offer(stack.pop());
            }
        }
        int[] res = new int[queue.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = queue.poll();
        }
        return res;
    }
}
