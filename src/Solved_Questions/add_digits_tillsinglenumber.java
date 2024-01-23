package Solved_Questions;

public class add_digits_tillsinglenumber {
    public static void main(String[] args) {
        int result = addDigits(38);
        System.out.println(result);
    }

    public static int addDigits(int num) {
        if (num < 10) {
            return num;
        }
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return addDigits(sum);
    }
}
