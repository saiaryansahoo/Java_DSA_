package Solved_Questions;

public class nto1 {
    public static void main(String[] args) {
        fun(10);//enter the number
    }
    static void fun(int n){
        if (n==0){
            return;
        }
        System.out.println(n);
        fun(n-1);
    }
}
