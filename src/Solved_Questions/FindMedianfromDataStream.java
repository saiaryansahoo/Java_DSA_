package Solved_Questions;

import java.util.PriorityQueue;
import java.util.Collections;

class MedianFinder {
    private PriorityQueue<Integer> maxHeap; // max-heap for the smaller half
    private PriorityQueue<Integer> minHeap; // min-heap for the larger half

    public MedianFinder() {
        maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        minHeap = new PriorityQueue<>();
    }

    public void addNum(int num) {
        // Add to max-heap first
        if (maxHeap.isEmpty() || num <= maxHeap.peek()) {
            maxHeap.add(num);
        } else {
            minHeap.add(num);
        }

        // Balance the heaps if needed
        if (maxHeap.size() > minHeap.size() + 1) {
            minHeap.add(maxHeap.poll());
        } else if (minHeap.size() > maxHeap.size()) {
            maxHeap.add(minHeap.poll());
        }
    }

    public double findMedian() {
        if (maxHeap.size() == minHeap.size()) {
            return (maxHeap.peek() + minHeap.peek()) / 2.0;
        } else {
            return maxHeap.peek();
        }
    }

    public static void main(String[] args) {
        // Create a MedianFinder object
        MedianFinder medianFinder = new MedianFinder();

        // Example usage:
        medianFinder.addNum(5);
        medianFinder.addNum(2);
        medianFinder.addNum(7);

        // Get the median
        double median = medianFinder.findMedian();
        System.out.println("Median: " + median);

        // Example additional numbers
        medianFinder.addNum(1);
        medianFinder.addNum(3);

        // Get the updated median
        median = medianFinder.findMedian();
        System.out.println("Updated Median: " + median);
    }
}
