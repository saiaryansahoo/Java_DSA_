package java_questions_solved;

public class countzeros {
    public static void main(String[] args) {
        System.out.println(count(10200020));
    }
    static int count(int n){
        return counts(n,0);
    }
    private static int counts(int n, int c) {
        if(n==0){
            return c;
        }
        int rem=n%10;
        if(rem==0) {
            return counts(n/10, c+1);
        }
        return counts(n/10,c);
    }
}
