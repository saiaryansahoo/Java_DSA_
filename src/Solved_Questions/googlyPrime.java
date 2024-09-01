package Solved_Questions;

import java.util.Scanner;

public class googlyPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int sum = 0;

        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

//        String s = sc.nextLine();

//        int sum = 0;
//        for (int i = 0; i < s.length(); i++) {
////            sum += s.charAt(i) + s.charAt(i + 1);
//            sum += Character.getNumericValue(s.charAt(i));
//        }
        System.out.println(isPrime(sum));

    }

    public static boolean isPrime(int s) {
        if (s<= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(s); i++) {
            if (s % i == 0) {
                return false;
            }
        }

        return true;
    }
}
