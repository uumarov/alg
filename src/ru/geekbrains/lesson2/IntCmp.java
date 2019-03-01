package ru.geekbrains.lesson2;

import java.util.Comparator;

public class IntCmp implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return o1 - o2;
    }
}