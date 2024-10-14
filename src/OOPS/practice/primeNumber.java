package OOPS.practice;

public class primeNumber {
    public static void main(String[] args) {
        int k=37;
        if(prime(k)){
            System.out.println("Valid");
        }else{
            System.out.println("Not Valid"  );
        }
    }

    private static boolean prime(int k) {
        if(k<=1){
            return false;
        }
        for (int i = 2; i*i <= k; i++) {
            if(k%i==0){
                return false;
            }
        }
        return true;
    }
}
