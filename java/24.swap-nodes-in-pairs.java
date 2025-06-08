class Solution {
     public ListNode swapPairs(ListNode head) {
        // Base case - Nothing to swap
        if (head == null || head.next == null) {
            return head;
        }
        // Recursive case - swap first two and the rest
        ListNode temp = head.next;
        head.next = swapPairs(temp.next);
        temp.next = head;
        return temp;
    }
}