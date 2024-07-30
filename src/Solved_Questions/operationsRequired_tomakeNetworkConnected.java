package Solved_Questions;

import java.util.*;

public class operationsRequired_tomakeNetworkConnected {
    public static void main(String[] args) {
        int n=8;
        int[][] connections={
                {0,1},
                {0,2},
                {0,3},
                {1,2},
                {1,3}};

        System.out.println(connectedNetwroks(n, connections));
    }

    private static int connectedNetwroks(int n, int[][] connections) {
        DisjointSet ds=new DisjointSet(n);
        int extras=0;
        int m=connections.length;
        for (int i = 0; i < m; i++) {
            int u=connections[i][0];
            int v=connections[i][1];
            if(ds.findUPar(u)==ds.findUPar(v)) {
                extras++;
            } else {
                ds.unionBySize(u,v);
            }
        }
        int connectedComponents=0;
        for (int i = 0; i < n; i++) {
            if (ds.parent.get(i) == i) {
                connectedComponents++;
            }
        }
        int ans = connectedComponents - 1;
        if (extras >= ans) {
            return ans;
        }
        return -1;
    }
}
class DisjointSet {
    List<Integer> rank = new ArrayList<>();
    List<Integer> parent = new ArrayList<>();
    List<Integer> size = new ArrayList<>();
    public DisjointSet(int n) {
        for (int i = 0; i <= n; i++) {
            rank.add(0);
            parent.add(i);
            size.add(1);
        }
    }

    public int findUPar(int node) {
        if (node == parent.get(node)) {
            return node;
        }
        int ulp = findUPar(parent.get(node));
        parent.set(node, ulp);
        return parent.get(node);
    }

    public void unionByRank(int u, int v) {
        int ulp_u = findUPar(u);
        int ulp_v = findUPar(v);
        if (ulp_u == ulp_v) return;
        if (rank.get(ulp_u) < rank.get(ulp_v)) {
            parent.set(ulp_u, ulp_v);
        } else if (rank.get(ulp_v) < rank.get(ulp_u)) {
            parent.set(ulp_v, ulp_u);
        } else {
            parent.set(ulp_v, ulp_u);
            int rankU = rank.get(ulp_u);
            rank.set(ulp_u, rankU + 1);
        }
    }

    public void unionBySize(int u, int v) {
        int ulp_u = findUPar(u);
        int ulp_v = findUPar(v);
        if (ulp_u == ulp_v) return;
        if (size.get(ulp_u) < size.get(ulp_v)) {
            parent.set(ulp_u, ulp_v);
            size.set(ulp_v, size.get(ulp_v) + size.get(ulp_u));
        } else {
            parent.set(ulp_v, ulp_u);
            size.set(ulp_u, size.get(ulp_u) + size.get(ulp_v));
        }
    }
}
