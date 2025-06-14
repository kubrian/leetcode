class Solution {
    public void deleteNode(ListNode node) {
        // Absolutely stupid (creative..?) question
        node.val = node.next.val; // Copy next val and...
        node.next = node.next.next; // skip next node
    }
}
