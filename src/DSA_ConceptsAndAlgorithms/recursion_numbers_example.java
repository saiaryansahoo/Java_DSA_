package DSA_ConceptsAndAlgorithms;

public class recursion_numbers_example {
    public static void main(String[] args) {
        print(1);
    }
    //better version and method for recursion(recursive function)
    //recursion is what a function calls itself
    static void print(int n){
        if (n==5){
            System.out.println(5);
            return;
        }
        System.out.println(n);
        print(n+1);
    }


    //not a good method for recursion
//    static void print1(int n){
//        System.out.println(n);
//        print2(2);
//    }
//
//    static void print2(int n){
//        System.out.println(n);
//        print3(3);
//    }
//
//    static void print3(int n){
//        System.out.println(n);
//        print4(4);
//    }
//
//    static void print4(int n){
//        System.out.println(n);
//        print5(5);
//    }
//
//    static void print5(int n){
//        System.out.println(n);
//    }

}
