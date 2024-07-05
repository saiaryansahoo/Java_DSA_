package Solved_Questions;

import java.util.*;

public class ReplaceElementsRank {

    static class Element {
        int value;
        int index;

        Element(int value, int index) {
            this.value = value;
            this.index = index;
        }
    }

    public static void main(String[] args) {
        int N = 7;
        int[] arr = {2, 20, 10, 3, 14, 16, 14};
        System.out.println(Arrays.toString(replaceWithRank(arr, N)));
    }

    public static int[] replaceWithRank(int[] arr, int N) {
        PriorityQueue<Element> pq = new PriorityQueue<>((a, b) -> a.value - b.value);

        for (int i = 0; i < N; i++) {
            pq.add(new Element(arr[i], i));
        }

        int[] ranks = new int[N];
        int rank = 1;
        int previousValue = pq.peek().value;
        int previousRank = rank;

        while (!pq.isEmpty()) {
            Element element = pq.poll();
            if (element.value != previousValue) {
                rank++;
                previousRank = rank;
            } else {
                rank = previousRank;
            }
            ranks[element.index] = rank;
            previousValue = element.value;
        }

        return ranks;
    }
}
