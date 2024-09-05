package Solved_Questions;

import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int result=0;

        while(n!=0){
            int digit=n%10;
            result =result*10+digit;
            n /= 10;
        }
        System.out.println(result);
    }
}
