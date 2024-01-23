package DSA_ConceptsAndAlgorithms.Recursion;

public class Q3 {
    //product of n to 1
    public static void main(String[] args) {
        System.out.println(Fact(3));
    }
    public static int Fact(int n){
        if(n<=1){
            return 1;
        }
        return n*Fact(n-1);
    }
}
