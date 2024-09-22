package Solved_Questions;

import java.util.*;

public class bobHalloween {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int[] A=new int[n];

        for (int i = 0; i < n; i++) {
            A[i]=sc.nextInt();
        }

        int M=sc.nextInt();

        int count=0;

        Arrays.sort(A);

        for (int i = 0; i < n; i++) {
            if(A[i]%5==0){
                count++;
            }else if(M>=A[i]){
                count++;
                M=M-A[i];
            }else{
                break;
            }
        }
        System.out.println(count);
    }
}
