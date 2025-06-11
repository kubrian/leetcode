class Solution {
    public ListNode insertionSortList(ListNode head) {
        ListNode sorted = new ListNode(0); // Dummy
        while (head != null) {
            ListNode next = head.next;
            ListNode prev = sorted;
            while (prev.next != null && prev.next.val < head.val) {
                prev = prev.next;
            }
            head.next = prev.next;
            prev.next = head;
            head = next;
        }
        return sorted.next;
    }
}
