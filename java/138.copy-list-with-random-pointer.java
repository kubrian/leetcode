import java.util.HashMap;
import java.util.Map;

/*
Clashes with Node.java
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/


class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }
        // This is just BFS with extra steps
        Map<Node, Node> oldToNew = new HashMap<>();
        Node curr = head;
        while (curr != null) {
            oldToNew.put(curr, new Node(curr.val));
            curr = curr.next;
        }
        curr = head;
        while (curr != null) {
            Node currNew = oldToNew.get(curr);
            currNew.next = oldToNew.get(curr.next);
            currNew.random = oldToNew.get(curr.random);
            curr = curr.next;
        }
        return oldToNew.get(head);
    }
}
