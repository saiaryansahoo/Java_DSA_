package java_questions_solved;

public class climbStairs {
    public static void main(String[] args) {

        System.out.println(climbStairs(8));
    }

    static int climbStairs(int n) {
        if (n <= 3) {
            return n;
        }
//        else { //this method is right but gives time limit error due to time complexity
//            return climbStairs(n - 1) + climbStairs(n - 2);

        int a = 3, b = 2;//this method is the best because of best time complexity
        for (int i = 0; i < n - 3; i++) {
            a = a + b;
            b = a - b;
        }
        return a;
    }
}
