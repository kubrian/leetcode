class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        // Trivial case
        if (head == null)
            return null;
        ListNode curr = head;
        // Move until there is no next node
        while (curr.next != null) {
            // Advance if different
            if (curr.val != curr.next.val) {
                curr = curr.next;
            } else {
                curr.next = curr.next.next;
            }
        }
        return head;
    }
}
