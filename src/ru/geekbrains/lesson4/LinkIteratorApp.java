package ru.geekbrains.lesson4;

import java.util.Iterator;

public class LinkIteratorApp {
    public static void main(String[] args) {
        MyLinkedList<Character> list = new MyLinkedList<>();
        list.addLast('a');
        list.addLast('b');
        list.addLast('c');
        list.addLast('d');
        list.addLast('e');
        list.addLast('f');
        list.addLast('g');

        Iterator<Character> iter = list.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

    }
}
