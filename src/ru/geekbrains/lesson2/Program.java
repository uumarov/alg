package ru.geekbrains.lesson2;

import java.util.Calendar;
import java.util.Iterator;

public class Program {
    public static void main(String[] args) {
        /*
        final int n = 10;
        int[] arr = new int[n];

        //arr[1]

        for (int i = 0; i < n; i++) {
            arr[i] = 2 * i + 1;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 2;
        }

        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        */
        MyArrayList<Character> list = new MyArrayList<>();
        list.add('x');
        list.add('e');
        list.add('f');
        list.add('k');
        System.out.println(list.size());
        System.out.println(list);
        System.out.println(list.get(2));
        list.set(2, 'r');
        System.out.println(list);
        System.out.println(list.indexOf('c'));
        System.out.println(list.indexOf('d'));
        list.remove('b');
        System.out.println(list.size());
        System.out.println(list);
        System.out.println("_____________");
        /*Iterator<Character> iter = list.iterator();
        while (iter.hasNext()) {
            Character c = iter.next();
            System.out.print(c + ", ");
        }
        for (Character c:
             list) {
            System.out.print(c + ", ");
        }
        */
        list.insertionSort(new CharCmp());
        System.out.println(list);
    }
}
