package ru.geekbrains.lesson2;

import java.util.Comparator;

public class CharCmp implements Comparator<Character> {
    @Override
    public int compare(Character o1, Character o2) {
        return o1 - o2;
    }
}
