package DSA_ConceptsAndAlgorithms;

public class patterns_practice {
    public static void main(String[] args) {
        pattern1(5);

    }
    static void pattern1(int n) {
        for (int row = 0; row <= 2*n; row++) {
            int totalColsInRow=row>n?2*n-row-1:row;
            for (int col = 1; col <= totalColsInRow; col++) {
                System.out.print("*");
            }
            System.out.println();

//    example
//    static void pattern1(int n) {
//        for (int row = 1; row <= n; row++) {
//            for (int col = 1; col <= n-row+1; col++) {
//                System.out.print(col);
//            }
//            System.out.println();

            //example
//    static void pattern1(int n) {
//        for (int row = 1; row <= n; row++) {
//            for (int col = 1; col <= row; col++) {
//                System.out.print(col +" ");
//            }
//            System.out.println();

            //pattern example
//    static void pattern1(int n) {
//        for (int row = 1; row <= n; row++) {
//            for (int col = 1; col <= n-row+1; col++) {
//                System.out.print("* ");
//            }
//            System.out.println();

            //1st pattern example
//    static void pattern1(int n) {
//        for (int row = 1; row <= n; row++) {
//            for (int col = 1; col <= row; col++) {
//                System.out.print("* ");
//            }
//            System.out.println();

            //2nd pattern example
//    static void pattern1(int n) {
//        for (int row = 1; row <= n; row++) {
//            for (int col = 1; col <= n; col++) {
//                System.out.print("* ");
//            }
//            System.out.println();
        }
    }
}
