package Solved_Questions;

import java.util.Scanner;

public class numberSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int[] arr=new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        if(arr.length==0 || arr==null)
            throw new IllegalArgumentException("Array must not be null or empty");


        int largest=arr[0];
        int smallest=arr[0];

        for (int i = 1; i < n; i++) {
            if(arr[i]>largest) largest=arr[i];
            else smallest=arr[i];
        }

        int sum=largest+smallest;

        System.out.println(sum);
    }
}
