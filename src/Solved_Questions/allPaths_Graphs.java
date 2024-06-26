package Solved_Questions;
import java.util.*;

public class allPaths_Graphs {
    static class Edge {
        int src;
        int dest;
        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static void main(String[] args) {
        int V = 6;
        int s = 5;
        int d = 1;
        ArrayList<Edge>[] graph = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));

        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));


        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));

        graph[0].add(new Edge(0, 3));

        printPaths(graph, s, d, "" + s);
    }

    public static void printPaths(ArrayList<Edge>[] graph, int s, int d, String path) {
        if (s == d) {
            System.out.println(path);
            return;
        }
        for (int i = 0; i < graph[s].size(); i++) {
            Edge e = graph[s].get(i);
            printPaths(graph, e.dest, d, path+"->"+e.dest);
        }
    }
}
