import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public void reorderList(ListNode head) {
        if (head == null) {
            return;
        }

        Deque<ListNode> deque = new ArrayDeque<>();
        while (head != null) {
            deque.offer(head);
            head = head.next;
        }

        boolean front = true;
        while (!deque.isEmpty()) {
            if (front) {
                head = deque.pollFirst();
                head.next = deque.peekLast();
            } else {
                head = deque.pollLast();
                head.next = deque.peekFirst();
            }
            front = !front;
        }
    }
}
