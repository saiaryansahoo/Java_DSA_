package Solved_Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class midArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int[] arr=new int[n];

        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if(arr[i]>=0){
                list.add(arr[i]);
            }
        }

        int midIndex = list.size() / 2;
        System.out.println(list.get(midIndex));
    }
}

