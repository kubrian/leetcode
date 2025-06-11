import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

/*
Clashes with Node.java
class Node {
    public int val;
    public List<Node> neighbors;

    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }

    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }

    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if (node == null) {
            return null;
        }

        // Map keys doubles as visited
        Map<Node, Node> oldToNew = new HashMap<>();
        Queue<Node> queue = new ArrayDeque<>();

        // Run BFS
        queue.offer(node);
        oldToNew.put(node, new Node(node.val));

        while (!queue.isEmpty()) {
            Node curr = queue.poll();
            Node newCurr = oldToNew.get(curr);
            for (Node neighbour : curr.neighbors) {
                if (!oldToNew.containsKey(neighbour)) {
                    oldToNew.put(neighbour, new Node(neighbour.val));
                    queue.offer(neighbour);
                }
                newCurr.neighbors.add(oldToNew.get(neighbour));
            }
        }

        return oldToNew.get(node);
    }
}
