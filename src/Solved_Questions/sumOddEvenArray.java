package Solved_Questions;

import java.util.ArrayList;
import java.util.Scanner;

public class sumOddEvenArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        ArrayList<Integer> evenArr = new ArrayList<>();
        ArrayList<Integer> oddArr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                evenArr.add(arr[i]);
            } else {
                oddArr.add(arr[i]);
            }
        }

        int secondLargestEven = findSecondLargest(evenArr);
        int secondLargestOdd = findSecondLargest(oddArr);

        int sum = secondLargestEven + secondLargestOdd;

        System.out.println(sum);
    }

    private static int findSecondLargest(ArrayList<Integer> arr) {
        if (arr.size() < 2) {
            return Integer.MIN_VALUE;
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i=0;i<arr.size();i++) {
            int num = arr.get(i);
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num < largest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            return largest;
        }

        return secondLargest;
    }
}
