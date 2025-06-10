class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        // Trivial: 0 or 1
        if (head == null || head.next == null) {
            return head;
        }
        // At least 2 nodes
        if (head.val == head.next.val) {
            // Repetition -- remove
            while (head.next != null && head.val == head.next.val) {
                head = head.next;
            }
            return deleteDuplicates(head.next);
        } else {
            // No repetition -- keep
            head.next = deleteDuplicates(head.next);
            return head;
        }

    }
}
