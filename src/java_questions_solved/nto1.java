package java_questions_solved;

public class nto1 {
    public static void main(String[] args) {
        fun(10);
    }
    static void fun(int n){
        if (n==0){
            return;
        }
        System.out.println(n);
        fun(n-1);
    }
}
