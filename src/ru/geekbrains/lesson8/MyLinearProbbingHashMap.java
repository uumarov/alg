package ru.geekbrains.lesson8;

public class MyLinearProbbingHashMap<Key, Value> {
    private int M = 15;
    private int size = 0;
    private Object[] keys = new Object[M];
    private Object[] values = new Object[M];
    
    private int size() {
        return size;
    }
    
    private boolean isEmpty() {
        return size == 0;
    }
    
    private int hash(Key key) {
        return (key.hashCode() & 0x7fffffff) % M;
    }

    private int doubleHash(Key key) {
        return 17 - (key.hashCode() & 0x7fffffff) % 17;
    }
    
    public Value get(Key key) {
        if (key == null) {
            throw new IllegalArgumentException("Ключ не может равняться null");
        }
        for (int i = hash(key); keys[i] != null; i = (i + 1) % M) {
            if (((Key)keys[i]).equals(key)) {
                return (Value) values[i];
            }
        }
        return null;
    }

    public boolean contains(Key key) {
        return get(key) != null;
    }

    public void put(Key key, Value value) {
        if (key == null) {
            throw new IllegalArgumentException("Ключ не может равняться null");
        }
        if (size == M - 1) {
            throw new IndexOutOfBoundsException("Достигнуто наибольшое количество элеменотов в коллекции.");
        }
        int i;
        int j;
        for (i = hash(key), j = doubleHash(key); keys[i] != null; i += j, i %= M) {
            if (((Key)keys[i]).equals(key)) {
                values[i] = value;
                return;
            }
        }
        keys[i] = key;
        values[i] = value;
        size++;
    }
}
