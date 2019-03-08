package ru.geekbrains.lesson3;
public class Program {
    public static void main(String[] args) {

        String str = "Hello World!";
        System.out.println(str);
        System.out.println(Util.invert(str));

        MyArrayDeque<Character> deque = new MyArrayDeque<>();
        deque.insertRight('y');
        deque.insertLeft('a');
        System.out.println(deque);
        deque.insertLeft('b');
        System.out.println(deque);
        deque.insertRight('c');
        System.out.println(deque);
        System.out.println(deque.peekLeft());
        System.out.println(deque.peekRight());
        deque.removeRight();
        System.out.println(deque);
        deque.removeLeft();
        System.out.println(deque);
    }
}
