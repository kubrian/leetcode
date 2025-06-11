class Solution {
    public ListNode detectCycle(ListNode head) {
        // If we move head and slow once slow meets fast, they will meet at the start of cycle
        // Some math can be done to prove this.

        // x = steps to start of cycle
        // y = step in cycle till fast meets slow
        // So fast - slow = 2(x + y) - (x + y) = x + y = k*l, l is length of cycle
        // Since slow is y steps ahead of cycle start, taking another x steps will take slow to the
        // start of cycle.
        // Taking x steps from head will take it to the start of cycle too.

        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                break;
            }
        }
        if (fast == null || fast.next == null) {
            return null;
        }
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
