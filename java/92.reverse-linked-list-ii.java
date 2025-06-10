class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        // Trivial, nothing to do
        if (left == right) {
            return head;
        }

        int pos = 1;
        ListNode resHead = null;
        ListNode frontTail = null;

        // Set the tail of the front section
        while (pos < left) {
            if (resHead == null) {
                resHead = head;
            }
            frontTail = head;
            head = head.next;
            pos++;
        }
        // pos == left (head at left, frontTail one behind head, possibly null)
        ListNode revTail = head;
        ListNode next = head.next;

        // Start reversing
        while (pos < right) {
            ListNode after = next.next;
            next.next = head;
            head = next;
            next = after;
            pos++;
        }

        // pos == right (head at right)
        ListNode revHead = head;
        ListNode backHead = next;

        // Join front and middle sections
        if (frontTail != null) {
            frontTail.next = revHead;
        } else {
            resHead = revHead;
        }

        // Join middle and back sections
        revTail.next = backHead;
        return resHead;
    }
}
