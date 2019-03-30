package ru.geekbrains.lesson7;

import java.util.LinkedList;

public class DepthFirstPaths {
    private boolean[] marked;
    private int[] edgeTo;
    private int source;

    public DepthFirstPaths(Graph g, int source) {
        if (source < 0) {
            throw new IllegalArgumentException();
        }
        if (source >= g.vertexCount()) {
            throw new IndexOutOfBoundsException();
        }
        this.source = source;
        edgeTo = new int[g.vertexCount()];
        marked = new boolean[g.vertexCount()];
        dfs(g, source);
    }

    private void dfs(Graph g, int v) {
        LinkedList<Integer> stack = new LinkedList<>();
        marked[v] = true;
        stack.push(v);
        while (!stack.isEmpty()){
            int vertex = getNextUnmarked(g, stack.peek());
            if(vertex == -1) {
                stack.pop();
            } else {
                marked[vertex] = true;
                stack.push(vertex);
            }
        }

    }

    private int getNextUnmarked(Graph g,int v){
        for (int w: g.adjList(v)) {
            if (!marked[w]) {
                edgeTo[w] = v;
                return w;
            }
        }
        return -1;
    }


    public boolean hasPathTo(int dist) {
        if (dist < 0) {
            throw new IllegalArgumentException();
        }
        if (dist >= marked.length) {
            throw new IndexOutOfBoundsException();
        }
        return marked[dist];
    }

    public LinkedList pathTo(int dist) {
        if (!hasPathTo(dist)) {
            return null;
        }
        LinkedList<Integer> stack = new LinkedList<>();

        int vertex = dist;
        while (vertex != source) {
            stack.push(vertex);
            vertex = edgeTo[vertex];
        }
        return stack;
    }
}
