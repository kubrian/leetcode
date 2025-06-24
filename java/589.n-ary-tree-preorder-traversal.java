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
    public List<Integer> preorder(Node root) {
        if (root == null) {
            return List.of();
        }

        List<Integer> res = new ArrayList<>();
        Stack<Node> preorder = new Stack<>();
        preorder.push(root);
        while (!preorder.empty()) {
            root = preorder.pop();
            res.add(root.val);
            List<Node> child = root.children;
            for (int i = child.size() - 1; i >= 0; i--) {
                preorder.push(child.get(i));
            }
        }

        return res;
    }
}
