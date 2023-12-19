package OOPS.ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a=5;
        int b=1;
        try {
            divide(a,b);
        }catch(ArithmeticException ex){
            System.out.println(ex.getMessage());
        }catch(Exception e){
            System.out.println("Normal Exception");
        }finally {
            System.out.println("This will be executed if any exception occurs");
        }
    }
    static int divide(int a, int b) throws  ArithmeticException{
        if(b==0){
            throw new ArithmeticException("Please don't divide by zero");
        }
        return a/b;
    }
}
