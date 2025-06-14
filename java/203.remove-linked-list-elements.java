class Solution {
    public ListNode removeElements(ListNode head, int val) {
        // Advance till first correct head
        while (head != null && head.val == val) {
            head = head.next;
        }
        ListNode curr = head;
        // Advance till end
        while (curr != null && curr.next != null) {
            if (curr.next.val == val) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        return head;
    }
}
