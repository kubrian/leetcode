import java.util.Stack;

class Solution {
    public int generateKey(int num1, int num2, int num3) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < 4; i++) {
            stack.push(Math.min(num1 % 10, Math.min(num2 % 10, num3 % 10)));
            num1 /= 10;
            num2 /= 10;
            num3 /= 10;
        }
        int res = 0;
        while (!stack.isEmpty()) {
            res = res * 10 + stack.pop();
        }
        return res;
    }
}
