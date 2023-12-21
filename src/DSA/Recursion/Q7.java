package DSA.Recursion;

public class Q7 {
    //PASSING NO.
    public static void main(String[] args) {
        pass(5);
    }
    static void pass(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        pass(--n);
    }
}
