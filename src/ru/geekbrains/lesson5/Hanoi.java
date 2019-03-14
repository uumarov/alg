package ru.geekbrains.lesson5;

import ru.geekbrains.lesson4.MyArrayStack;

public class Hanoi {
    static int num = 10;
    public static void main(String[] args) {

        MyArrayStack<Integer> rock1 = new MyArrayStack<>();
        MyArrayStack<Integer> rock2 = new MyArrayStack<>();
        MyArrayStack<Integer> rock3 = new MyArrayStack<>();

        for (int i = num; i > 0; i--) {
            rock1.push(i);
        }

        print(rock1, rock2, rock3);

        trans(rock1, rock2, rock3);

        print(rock1, rock2, rock3);

    }

    public static void trans(MyArrayStack rock1, MyArrayStack rock2, MyArrayStack rock3) {
        while(rock3.size() < num){
            move(rock1, rock2);
            move(rock1, rock3);
            move(rock2, rock3);
        }
    }

    public static void move(MyArrayStack<Integer> from, MyArrayStack<Integer>  to) {
        int fromInt = from.isEmpty() ? num : from.peek();
        int toInt = to.isEmpty() ? num : to.peek();
        if(to.size() == 0){
           to.push(from.pop());
        } else if (fromInt < toInt) {
            to.push(from.pop());
        } else if (fromInt > toInt) {
            from.push(to.pop());
        }
    }

    public static void print(MyArrayStack rock1, MyArrayStack rock2, MyArrayStack rock3) {
        System.out.println("1: " + rock1);
        System.out.println("2: " + rock2);
        System.out.println("3: " + rock3);
        System.out.println("----------------");
    }
}
