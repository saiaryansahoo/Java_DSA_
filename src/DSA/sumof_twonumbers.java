package DSA;

import java.util.Scanner;

public class sumof_twonumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the First No:");
        float a = input.nextFloat();
        System.out.print("Enter the Second No:");
        float b = input.nextFloat();


        float c=a+b;
        System.out.println("Sum"+"="+c);
    }
}
