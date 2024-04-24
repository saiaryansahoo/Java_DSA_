package Solved_Questions;

import java.util.Scanner;

public class NTribonacciNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number=input.nextInt();
        FiboN fib=new FiboN();
        System.out.println(fib.tribonacci(number));
    }
}
class FiboN {
    public int tribonacci(int n) {
        if ( n==0) return 0;
        if ( n==1) return 1;
        if ( n==2) return 1;
        int i =2 ,a=0,b=1,c=1,d=0;
        while ( i <n){
            d =a+b+c;
            a=b;b=c;c=d;
            i++;
        }
        return d;
    }
}