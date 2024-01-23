package Solved_Questions;

public class sum_of_digits {
    public static void main(String[] args) {
        int ans=sum(134);
        System.out.println(ans);
    }

    static int sum(int n) {
        if (n == 0) {
            return 0;
        }
        return sum(n / 10) + (n % 10);
    }
}
