package OOPS.practice;

import java.util.PriorityQueue;

public class kthLargest {
    public static void main(String[] args) {
        int[] arr={99,86,2,4,44,56,01,79};//1,2,3,5,6,7,8,9
        int k=2;

        PriorityQueue<Integer> queue=new PriorityQueue<>();

        for(int i=0; i<arr.length; i++) {
            queue.add(arr[i]);
            if (queue.size() > k) {
                queue.remove();
            }
        }
        System.out.println(queue.peek());
    }
}
