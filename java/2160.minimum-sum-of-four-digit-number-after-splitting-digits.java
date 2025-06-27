import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    public int minimumSum(int num) {
        Queue<Integer> queue = new PriorityQueue<>();
        while (num > 0) {
            queue.add(num % 10);
            num /= 10;
        }
        int num1 = 0;
        int num2 = 0;
        while (!queue.isEmpty()) {
            num1 = num1 * 10 + queue.poll();
            if (queue.isEmpty()) {
                break;
            }
            num2 = num2 * 10 + queue.poll();
        }
        return num1 + num2;
    }
}
