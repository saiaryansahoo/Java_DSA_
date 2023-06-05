package java_questions_solved;

import java.util.Scanner;

public class nth_fibonacci_recursion {
    public static void main(String[] args) {
        Scanner enter=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n=enter.nextInt();
        System.out.println(fibo(n));
    }

    //nth fibonacci(F)=F(N-1)+F(N-2)
    static int fibo(int n){
        if(n<=1){ //base condition
            return n;
        }
        else {
            return fibo(n-1)+fibo(n-2);
        }

    }
}
