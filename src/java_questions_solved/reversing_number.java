package java_questions_solved;

public class reversing_number {
    public static void main(String[] args) {
        reverse(2025);
        System.out.println(sum);
    }
    static int sum=0;
    static void reverse(int n){
        if(n==0){
            return;
        }
        int rem =n%10;
        sum=sum*10+rem;
        reverse(n/10);
    }
}
