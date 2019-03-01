package ru.geekbrains.lesson2;

import java.util.concurrent.ThreadLocalRandom;

public class Util {
    public static int getRndInt(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

    public static int[] getRndArray(int N, int MIN, int MAX) {
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = (getRndInt(MIN, MAX));
        }

        return arr;
    }

    public static void arrayToMyArrayList(int[] arr, MyArrayList<Integer> list){
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
    }

}
