package OOPS.practice;

public class fibonacci {
    public static void main(String[] args) {
        int k=11;
//        for (int i = 0; i < k; i++) {
//            System.out.print(fibo(i)+" ");
//        }
        fibo(k);
    }

    private static void fibo(int k) {
        int a=0;
        int b=1;
        System.out.print(a+" "+b+" ");
        for (int i = 2; i < k; i++) {
            int next = a + b;
            System.out.print(next + " ");
            a=b;
            b=next;
        }

//        if(k==0){
//            return 0;
//        }else if(k==1){
//            return 1;
//        }else{
//            return fibo(k-1)+fibo(k-2);
//        }
    }
}
