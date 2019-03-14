package ru.geekbrains.lesson5;

import ru.geekbrains.lesson4.MyArrayStack;

public class HanoiRec {

    public static void main(String[] args) {
        int num = 4;

        MyArrayStack<Integer> rock1 = new MyArrayStack<>();
        MyArrayStack<Integer> rock2 = new MyArrayStack<>();
        MyArrayStack<Integer> rock3 = new MyArrayStack<>();

        for (int i = num; i > 0; i--) {
            rock1.push(i);
        }

        print(rock1, rock2, rock3);

        trans(rock1, rock3, rock2, num);

        print(rock1, rock2, rock3);

    }

    public static void trans(MyArrayStack from, MyArrayStack to, MyArrayStack through, int num) {
        if (num == 1){
            to.push(from.pop());
        }
        else {
            trans(from, through, to, num-1);
            to.push(from.pop());
            trans(through, to, from, num-1);
        }
    }

    public static void print(MyArrayStack rock1, MyArrayStack rock2, MyArrayStack rock3) {
        System.out.println("1: " + rock1);
        System.out.println("2: " + rock2);
        System.out.println("3: " + rock3);
        System.out.println("----------------");
    }

}
