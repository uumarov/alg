package ru.geekbrains.lesson4;

public class Program {
    public static void main(String[] args) {
        MyLinkedList<Character> list = new MyLinkedList<>();
        list.addLast('a');
        list.addLast('b');
        list.addLast('c');
        list.addLast('d');
        list.addLast('e');
        list.addLast('f');
        list.addLast('g');
        System.out.println(list);
        System.out.println(list.get(5));
        list.set(2, 't');
        System.out.println(list);
        list.set(4, 't');
        System.out.println(list);
    }
}
