package Solved_Questions;

import java.util.Scanner;

public class validPasswordChar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        char[] str = new char[n];

        for (int i = 0; i < str.length; i++) {
            str[i] = sc.next().charAt(0);
        }

        System.out.println(checkPassword(str, n));
    }

    private static int checkPassword(char[] str, int n) {
        if (n < 4) {
            return 0;
        }

        boolean hasDigit = false;
        boolean hasUpper = false;
        boolean hasInvalidChar = false;

        if (Character.isDigit(str[0])) {
            return 0;
        }

        for (int i = 0; i < n; i++) {
            if (Character.isDigit(str[i])) {
                hasDigit = true;
            }
            if (Character.isUpperCase(str[i])) {
                hasUpper = true;
            }
            if (str[i] == ' ' || str[i] == '/') {
                hasInvalidChar = true;
            }
        }

        if (hasDigit && hasUpper && !hasInvalidChar) {
            return 1;
        } else {
            return 0;
        }
    }
}
