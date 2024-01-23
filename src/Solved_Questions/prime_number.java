package Solved_Questions;

import java.util.Scanner;
public class prime_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Prime Number Upto: ");
        int n = sc.nextInt();
        prime(n);
    }
    static boolean checkPrime(int n) {
        if(n==1) {
            return false;
        }
        if(n==2 || n==3) {
            return true;
        }
        if(n%2==0 || n%3==0) {
            return false;
        }
        for(int i=5;i*i<=n;i=i+6) {
            if(n%i==0 || n%(i+2)==0 ) {
                return false;
            }

        }
        return true;
    }
    static void prime(int n) {
        for(int i=2;i<=n;i++) {
            if(checkPrime(i)) {
                System.out.print(i+" ");
            }

        }

    }
}
