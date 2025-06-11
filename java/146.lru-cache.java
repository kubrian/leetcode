import java.util.HashMap;
import java.util.Map;

class DoubleLinkedNode {
    int key;
    int value;
    DoubleLinkedNode prev;
    DoubleLinkedNode next;

    public DoubleLinkedNode(int key, int value) {
        this.key = key;
        this.value = value;
    }
}


class LRUCache {

    private int capacity;
    private Map<Integer, DoubleLinkedNode> map;
    private DoubleLinkedNode head;
    private DoubleLinkedNode tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.map = new HashMap<>();
        this.head = new DoubleLinkedNode(0, 0); // Dummy
        this.tail = new DoubleLinkedNode(0, 0); // Dummy
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        DoubleLinkedNode node = map.getOrDefault(key, null);
        if (node == null) {
            return -1;
        }
        put(key, node.value);
        return node.value;
    }

    public void put(int key, int value) {
        DoubleLinkedNode node = map.getOrDefault(key, new DoubleLinkedNode(key, value));
        node.value = value;
        map.put(key, node);

        if (node.prev != null) {
            node.prev.next = node.next;
            node.next.prev = node.prev;
        }
        node.next = head.next;
        node.prev = head;
        head.next.prev = node;
        head.next = node;

        if (map.size() > capacity) {
            map.remove(tail.prev.key);
            tail.prev = tail.prev.prev;
            tail.prev.next = tail;
        }
    }
}
