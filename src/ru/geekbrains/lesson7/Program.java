package ru.geekbrains.lesson7;

import java.util.LinkedList;

public class Program {
    public static void main(String[] args) {
        Graph g = new Graph(6);
        g.addEdge(0, 2);
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(5, 3);
        g.addEdge(3, 4);
        g.addEdge(3, 2);
        g.addEdge(4, 2);
        g.addEdge(5, 0);

        BreadthFirstPaths bfp = new BreadthFirstPaths(g, 0);
        System.out.println(bfp.hasPathTo(5));
        System.out.println(bfp.pathTo(3));
        System.out.println(bfp.pathTo(5));
        System.out.println(bfp.distTo(1));
        System.out.println(bfp.distTo(2));
        System.out.println(bfp.distTo(3));
        System.out.println(bfp.distTo(4));
        System.out.println(bfp.distTo(5));
    }
}
