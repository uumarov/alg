package ru.geekbrains.lesson8;

public class MyChainingHashMap<Key, Value> {
    private int M = 1;
    private int size = 0;
    private Object[] st = new Object[M];
    private class Node {
        Key key;
        Value value;
        Node next;

        public Node(Key key, Value value, Node next) {
            this.key = key;
            this.next = next;
            this.value = value;
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private int hash(Key key) {
        return (key.hashCode() & 0x7fffffff) % M;
    }

    public Value get(Key key) { //a[key]
        if (key == null) {
            throw new IllegalArgumentException("Ключ не может равняться null");
        }
        int i = hash(key);
        Node x = (Node) st[i];
        while (x != null) {
            if (key.equals(x.key)) {
                return x.value;
            }
            x = x.next;
        }
        return null;
    }

    public Value remove(Key key){
        if (key == null) {
            throw new IllegalArgumentException("Ключ не может равняться null");
        }
        int i = hash(key);
        Node current = (Node) st[i];

        while (current != null) {
            if (key.equals(current.key)) {
                Value value = current.value;
                st[i] = current.next;
                size--;
                return value;
            }
            if (current.next != null && key.equals(current.next.key)){
                Value value = current.next.value;
                current.next = current.next.next;
                size--;
                return value;
            }
            current = current.next;
        }

        return null;

    }

    public boolean contains(Key key) {
        return get(key) != null;
    }

    public void put(Key key, Value value) { //a[key] = value
        if (key == null) {
            throw new IllegalArgumentException("Ключ не может равняться null");
        }
        int i = hash(key);
        Node x = (Node) st[i];
        while (x != null) {
            if (key.equals(x.key)) {
                x.value = value;
                return;
            }
            x = x.next;
        }
        st[i] = new Node(key, value, (Node) st[i]);
        size++;
    }
}
