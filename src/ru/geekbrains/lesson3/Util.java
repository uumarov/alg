package ru.geekbrains.lesson3;

public class Util {
    public static String invert (String str) {
        MyArrayStack stack = new MyArrayStack();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        return stack.toString();
    }
}
