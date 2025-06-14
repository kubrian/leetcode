class Solution {
    public boolean isPalindrome(ListNode head) {
        // Assume that we can mutate the linked list
        // Reverse second half of the list, then traverse
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Odd nodes -> slow at midpoint (axa)
        // Even nodes -> slow at start of second half (aaxa)
        // Start reversing from slow.next
        ListNode prev = slow;
        ListNode curr = slow.next;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Now join the ends and traverse
        slow.next = null;
        ListNode left = head;
        ListNode right = prev;
        while (right != null) {
            if (left.val != right.val) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
}
