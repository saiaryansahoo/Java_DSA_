package Solved_Questions;

public class stringTointeger {
    public static void main(String[] args) {
        String s="42";

        System.out.print(myAtoi(s));
    }

    public static int myAtoi(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        s = s.trim();
        if (s.length() == 0) {
            return 0;
        }

        int sign = 1;
        int index = 0;
        long result = 0;

        if (s.charAt(index) == '+') {
            index++;
        } else if (s.charAt(index) == '-') {
            sign = -1;
            index++;
        }

        while (index < s.length()) {
            char c = s.charAt(index);
            if (!Character.isDigit(c)) {
                break;
            }

            int digit = c - '0';

            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
                if (sign == 1) {
                    return Integer.MAX_VALUE;
                } else {
                    return Integer.MIN_VALUE;
                }
            }


            result = result * 10 + digit;
            index++;
        }

        return (int) (result * sign);
    }
}
