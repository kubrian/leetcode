import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    public int largestInteger(int num) {
        Queue<Integer> even = new PriorityQueue<>(Collections.reverseOrder());
        Queue<Integer> odd = new PriorityQueue<>(Collections.reverseOrder());
        int[] digits = String.valueOf(num).chars().map(c -> c - '0').toArray();
        for (int digit : digits) {
            if (digit % 2 == 0) {
                even.add(digit);
            } else {
                odd.add(digit);
            }
        }
        int res = 0;
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] % 2 == 0) {
                res = res * 10 + even.poll();
            } else {
                res = res * 10 + odd.poll();
            }
        }
        return res;
    }
}
