package ru.geekbrains.lesson6;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        double treeCount = 1000000;
        int treeHeight = 6;
        int min = -100;
        int max = 100;
        double balancedTrees = 0;

        ArrayList<MyTreeMap<Integer, Integer>> treeMaps = new ArrayList<>();

        for (int i = 0; i < treeCount; i++) {
            treeMaps.add(new MyTreeMap<>());
        }

        for (MyTreeMap tm:
             treeMaps) {
            while (tm.height() < treeHeight) {
                int rnd = min + (int)(Math.random() * ((max - min) + 1));
                tm.put(rnd, 0);
            }
            if (tm.isBalanced()) balancedTrees++;
        }

        double percent = (balancedTrees/treeCount)*100.0;

        System.out.println("Деревьев всего: " + treeCount);
        System.out.println("Глубина деревьев: " + treeHeight);
        System.out.println("Cбалансированных деревьев: " + balancedTrees);
        System.out.println(String.format("Процент сбалансированных деревьев: %.4f", + percent));

    }
}
