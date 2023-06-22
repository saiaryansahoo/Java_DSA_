import java.util.Scanner;

public class combinationNumbers {
    static int phi(int n) {
        int result = n;

        for (int p = 2; p * p <= n; p++) {
            if (n % p == 0) {
                while (n % p == 0) {
                    n = n / p;
                }
                result = result - result / p;
            }
        }

        if (n > 1)
            result = result - result / n;

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        scanner.close();

        int eulerTotient = phi(n);
        System.out.println("Euler's Totient Function for " + n + ": " + eulerTotient);
    }
}