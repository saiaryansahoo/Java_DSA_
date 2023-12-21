package DSA.Recursion;

public class Q2 {
    public static void main(String[] args) {
        //1 to n
        funRev(5);
    }
    static void funRev(int n) {
        if (n == 0) {
            return;
        }
        funRev(n - 1);
        System.out.println(n);
    }
}
