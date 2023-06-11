package java_questions_solved;

public class product_digit {
    public static void main(String[] args) {
        int ans=multi(1342);
        System.out.println(ans);
    }

    static int multi(int n) {
        if (n%10 == n) {
            return n;
        }
        return multi(n / 10) * (n % 10);
    }
}
