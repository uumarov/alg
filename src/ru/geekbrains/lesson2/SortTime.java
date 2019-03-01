package ru.geekbrains.lesson2;

public class SortTime {


    public static long getInsertionTime(MyArrayList<Integer> list) {

        long start, end;
        start = System.nanoTime();
        list.insertionSort(new IntCmp());
        end = System.nanoTime();
        return end - start;
    }

    public static long getSelectionTime(MyArrayList<Integer> list) {
        long start, end;
        start = System.nanoTime();
        list.selectionSort(new IntCmp());
        end = System.nanoTime();
        return end - start;
    }


}
