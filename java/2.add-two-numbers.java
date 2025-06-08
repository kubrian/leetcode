class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode tail = null;
        int carry = 0;
        // Some digits left
        while (l1 != null || l2 != null || carry != 0) {
            // Get and advance digits
            int d1 = (l1 == null) ? 0 : l1.val;
            int d2 = (l2 == null) ? 0 : l2.val;
            l1 = (l1 == null) ? null : l1.next;
            l2 = (l2 == null) ? null : l2.next;

            // Calculate
            int sum = d1 + d2 + carry;
            ListNode currNode = new ListNode(sum % 10);
            carry = sum / 10;

            // Append to linked list
            if (head == null) {
                head = tail = currNode;
            } else {
                tail = tail.next = currNode;
            }
        }
        return head;
    }
}