package Solved_Questions;

import java.util.*;
public class dividedIndex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int quotient=sc.nextInt();
        int divisor=sc.nextInt();
        int remainder=sc.nextInt();

        int dividend=quotient*divisor+remainder;
        System.out.println("The dividend is " + dividend);
        for (int i = 0; i < n; i++) {
            if(arr[i]==dividend){
                System.out.println("Divides is at index : "+i);
                break;
            }else if(arr[i] != dividend){
                System.out.println(-1);
                break;
            }
        }

    }
}
