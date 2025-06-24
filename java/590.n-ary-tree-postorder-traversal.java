/*
Clashes with Node.java
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Solution {
    public List<Integer> postorder(Node root) {
        if (root == null) {
            return List.of();
        }
        Stack<Node> aux = new Stack<>();
        Stack<Node> postOrder = new Stack<>();
        aux.push(root);

        while (!aux.empty()) {
            // left -> right -> root
            // so push left before right so that it is dealt with later
            root = aux.pop();
            postOrder.push(root);
            for (Node child: root.children) {
                aux.push(child);
            }
        }

        List<Integer> res = new ArrayList<>();
        while (!postOrder.isEmpty()) {
            res.add(postOrder.pop().val);
        }
        return res;
    }
}
