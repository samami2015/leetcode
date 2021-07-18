import java.util.HashMap;

public class LC0146 {
    class Node {
        int key, value;
        public Node next, prev;

        public Node(int k, int v) {
            this.key = k;
            this.value = v;
        }
    }

    class DoubleList {
        Node head, tail;
        int size = 0;

        public void addFirst(Node x) {
            x.prev = head;
            x.next = head.next;
            head.next.prev = x;
            head.next = x;
            ++size;
        }

        public void remove(Node x) {
            x.prev.next = x.next;
            x.next.prev = x.prev;
            --size;
        }

        public Node removeLast() {
            Node res = tail.prev;
            remove(res);
            return res;
        }

        public int size() {
            return size;
        }
    }

    public static void main(String[] args) {
        LC0146 cache = new LC0146(2);
        cache.put(1, 1);
        cache.put(2, 2);
        cache.get(1);
        cache.put(3, 3);
        cache.get(2);
        cache.put(1, 4);
    }

    HashMap<Integer, Node> map;
    DoubleList cache;
    private int cap;

    public LC0146(int capacity) {
        this.cap = capacity;
        map = new HashMap<>();
        cache = new DoubleList();
    }

    public int get(int key) {
        if (!map.containsKey(key)) {
            return -1;
        }
        int val = map.get(key).value;
        put(key, val);
        return val;
    }

    public void put(int key, int value) {
        Node x = new Node(key, value);
        if (map.containsKey(key)) {
            cache.remove(map.get(key));
            cache.addFirst(x);
            map.put(key, x);
        } else {
            if (cap == cache.size()) {
                Node last = cache.removeLast();
                map.remove(last.key);
            }
            cache.addFirst(x);
            map.put(key, x);
        }

    }
}

