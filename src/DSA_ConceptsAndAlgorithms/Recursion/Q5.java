package DSA_ConceptsAndAlgorithms.Recursion;

public class Q5 {
    //sum of digits
    public static void main(String[] args) {
        System.out.println(Sum(1342));
    }
    public static int Sum(int n){
        if (n==0){
            return 0;
        }
        return Sum(n / 10) + (n % 10);
    }
}
