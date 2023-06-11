package java_questions_solved;

public class one_to_n {
    public static void main(String[] args) {
        fun(4);
    }
    static void fun(int n){
        if(n==0){
            return;
        }
        fun(n-1);
        System.out.println(n);
    }
}
