package java_questions_solved;

import java.util.Scanner;

public class combinationNumbers {
    static int phi(int n)
    {
        // Initialize result as n
        int result = n;

        // Consider all prime factors
        // of n and subtract their
        // multiples from result
        //for (int i = 0; i < array.length; i++) {


        for (int p = 2; p * p <= n; p++)
        {

            // Check if p is
            // a prime factor.
            while (n % p ==0)
            {

                // If yes, then update
                // n and result
                if (n % p == 0)
                    n =n/p;
                result = result-result / p;
            }
        }

        // If n has a prime factor
        // greater than sqrt(n)
        // (There can be at-most
        // one such prime factor)
        if (n > 1)
            result = result- result  /n;
        return result;
    }


    public static void main (String[] args)
    {
        //	int n=1000;
        Scanner n1 = new Scanner(System.in);
        System.out.print("Prime Number Upto: ");
        int n = n1.nextInt();
        System.out.println("Total No's of Prime Number upto: "+ phi(n));
    }
}
