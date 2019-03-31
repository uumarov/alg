package ru.geekbrains.lesson8;

public class Program {
    public static void main(String[] args) {
//        MyChainingHashMap<Character, Integer> hm = new MyChainingHashMap<>();
//        hm.put('a', 1);
//        hm.put('b', 2);
//        hm.put('x', 3);
//        hm.put('t', 4);
//        hm.put('u', 5);
//        hm.put('p', 6);
//        hm.put('q', 7);
//        hm.put('z', 8);
//        hm.put('g', 9);
//
//        System.out.println(hm.remove('z'));
//        System.out.println(hm.remove('g'));
//        System.out.println(hm.remove('a'));
//        System.out.println(hm.get('a'));

        MyLinearProbbingHashMap<Character, Integer> lp = new MyLinearProbbingHashMap<>();
        lp.put('s', 1);
        lp.put('e', 2);
        lp.put('a', 3);
        lp.put('r', 4);
        lp.put('c', 5);
        lp.put('h', 6);
        lp.put('x', 7);
        lp.put('m', 8);


    }
}
