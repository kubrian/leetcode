class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // Travel twice.
        // Suppose a = x + y; b = z + y, where y is the shared section
        // Then travel through x -> y -> z and z -> y -> x (same dist)
        // If no intersection same as y == 0
        ListNode a = headA;
        ListNode b = headB;
        while (a != b) {
            a = a == null ? headB : a.next;
            b = b == null ? headA : b.next;
        }
        return a;
    }
}
