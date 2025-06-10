import java.util.ArrayDeque;
import java.util.Queue;

class Solution {
    public Node connect(Node root) {
        if (root == null) {
            return null;
        }
        Queue<Node> currLevel = new ArrayDeque<>();
        currLevel.offer(root);
        while (!currLevel.isEmpty()) {
            Queue<Node> nextLevel = new ArrayDeque<>();
            while (!currLevel.isEmpty()) {
                Node curr = currLevel.poll();
                if (curr.left != null) {
                    nextLevel.offer(curr.left);
                }
                if (curr.right != null) {
                    nextLevel.offer(curr.right);
                }
                if (!currLevel.isEmpty()) {
                    curr.next = currLevel.peek();
                }
            }
            currLevel = nextLevel;
        }
        return root;
    }
}
