package DSA.Recursion;

public class Q4 {
    // sum of n to 1
    public static void main(String[] args) {
        System.out.println(FactSum(5));
    }
    public static int FactSum(int n){
        if(n<=1){
            return 1;
        }
        return n+FactSum(n-1);
    }
}
