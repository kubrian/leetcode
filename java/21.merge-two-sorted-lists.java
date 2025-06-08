class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Trivial cases
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }

        // Initialize the result
        ListNode resHead;
        if (list1.val < list2.val) {
            resHead = list1;
            list1 = list1.next;
        } else {
            resHead = list2;
            list2 = list2.next;
        }
        ListNode curr = resHead;

        // While both are not null
        while (list1 != null && list2 != null) {
            // Insert from first list
            if (list1.val < list2.val) {
                curr.next = list1;
                list1 = list1.next;
            } else {
                curr.next = list2;
                list2 = list2.next;
            }
            curr = curr.next;
        }
        // Either is null now
        if (list1 == null) {
            curr.next = list2;
        } else {
            curr.next = list1;
        }
        return resHead;
    }
}