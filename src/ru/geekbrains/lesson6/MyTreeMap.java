import java.security.PublicKey;
import java.util.Comparator;
import java.util.NoSuchElementException;

public class MyTreeMap<Key extends Comparable<Key>, Value> {
    private class Node {
        Key key;
        Value value;
        Node left;
        Node right;
        int size; //кол-во узлов в дереве, корнем которого является данный узел
        public Node(Key key, Value value, int size) {
            this.key = key;
            this.value = value;
            this.size = size;
        }
    }

    private Node root = null;

    public boolean isEmpty() {
        return root == null;
    }

    public int size() {
        return size(root);
    }

    private int size(Node node) {
        if (node == null) {
            return 0;
        }
        else {
            return node.size;
        }
    }

    public Value get(Key key) {
        return get(root, key);
    }

    private Value get(Node node, Key key) { //a[key]
        if (key == null) {
            throw new IllegalArgumentException("Не может быть ключа со значением null");
        }
        if (node == null) {
            return null;
        }
        int cmp = key.compareTo(node.key);
        if (cmp == 0) {
            return node.value;
        }
        if (cmp < 0) {
            return get(node.left, key);
        }
        else { //cmp > 0
            return get(node.right, key);
        }
    }

    public boolean contains(Key key) {
        return get(key) != null;
    }

    public void put(Key key, Value value) { //a[key] = value
        root = put(root, key, value);
    }

    private Node put(Node node, Key key, Value value) {
        if (key == null) {
            throw new IllegalArgumentException("Не может быть ключа со значением null");
        }
        if (node == null) {
            return new Node(key, value, 1);
        }

        int cmp = key.compareTo(node.key);
        if (cmp == 0) {
            node.value = value;
        }
        else if (cmp < 0) {
            node.left = put(node.left, key, value);
        }
        else { //cmp > 0
            node.right = put(node.right, key, value);
        }

        node.size = size(node.left) + size(node.right) + 1;
        return node;
    }

    private Node min(Node node) {
        if (node.left == null) {
            return node;
        }
        else {
            return min(node.left);
        }
    }

    public Value min() {
        return min(root).value;
    }

    private Node max(Node node) {
        if (node.right == null) {
            return node;
        }
        else {
            return max(node.right);
        }
    }

    public Value max() {
        return max(root).value;
    }

    private Node removeMin(Node node) {
        if (node.left == null) {
            return node.right;
        }
        else {
            node.left = removeMin(node.left);
        }
        node.size = size(node.left) + size(node.right) + 1;
        return node;
    }

    public void removeMin() {
        if (isEmpty()) {
            throw new NoSuchElementException("Tree is empty");
        }
        root = removeMin(root);
    }

    private Node removeMax(Node node) {
        if (node.right == null) {
            return node.left;
        }
        else {
            node.right = removeMax(node.right);
        }
        node.size = size(node.left) + size(node.right) + 1;
        return node;
    }

    public void removeMax() {
        if (isEmpty()) {
            throw new NoSuchElementException("Tree is empty");
        }
        root = removeMax(root);
    }

    public void remove(Key key) {
        root = remove(root, key);
    }

    private Node remove(Node node, Key key) {
        if (node == null) {
            return null;
        }
        int cmp = key.compareTo(node.key);
        if (cmp < 0) {
            node.left = remove(node.left, key);
        }
        else if (cmp > 0) {
            node.right = remove(node.right, key);
        }
        else {
            if (node.left == null) {
                return node.right;
            }
            if (node.right == null) {
                return node.left;
            }

            Node tmp = node;
            node = max(node.left);
            node.left = removeMax(tmp.left);
            node.right = tmp.right;
            tmp = null;
        }
        node.size = size(node.left) + size(node.right) + 1;
        return node;
    }
}
