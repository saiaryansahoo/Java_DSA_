package DSA.Recursion;

public class Q6 {
    //product of digits
    public static void main(String[] args) {
        System.out.println(Product(121));
    }
    public static int Product(int n){
        if (n%10==n){
            return n;
        }
        return Product(n / 10) * (n % 10);
    }
}
