package DSA_ConceptsAndAlgorithms;

import java.util.Comparator;
import java.util.*;

public class priorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());

        pq.add(1);
        pq.add(2);
        pq.add(4);
        pq.add(0);
        pq.add(11);
        pq.remove(2);

        while(!pq.isEmpty()){
            System.out.print(pq.peek()+"->");
            pq.remove();
        }
    }
}
