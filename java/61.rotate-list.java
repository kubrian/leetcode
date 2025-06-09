class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        // No rotation needed
        if (head == null || head.next == null) {
            return head;
        }
        // Reach tail node and count
        int count = 1;
        ListNode curr = head;
        while (curr.next != null) {
            curr = curr.next;
            count++;
        }

        // Join tail to head
        int rotations = (count - k % count) % count;
        curr.next = head;

        // Advance to new tail
        for (int i = 0; i < rotations; i++) {
            curr = curr.next;
        }

        head = curr.next;
        curr.next = null;
        return head;
    }
}
