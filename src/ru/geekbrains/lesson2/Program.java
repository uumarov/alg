package ru.geekbrains.lesson2;

public class Program {
    public static void main(String[] args) {
        final int MIN = 1;
        final int MAX = 1000000;
        final int N = 10000;
        final int M = 10;


        MyArrayList<Integer> list;

        for (int i = 1; i <= M; i++) {
            int[] arr = Util.getRndArray(N, MIN, MAX);
            list = new MyArrayList<>();
            Util.arrayToMyArrayList(arr, list);
            System.out.println(i + "." + "\t\tinsertionSort: " + SortTime.getInsertionTime(list));
            list = new MyArrayList<>();
            Util.arrayToMyArrayList(arr, list);
            System.out.println("\t\tselectionSort: " + SortTime.getSelectionTime(list) + "\n");
        }

    }
}
