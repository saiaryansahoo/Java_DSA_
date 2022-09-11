package jeet;

import java.util.Scanner;

public class firstproject {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter Your Salary:"+ " ");
        int salary=input.nextInt();

        if (salary>100000) {
            salary=salary+50000;
            System.out.print("Net Salary is:" + " " + salary);
        }
        else if (salary<50000) {
            salary=salary+15000;
            System.out.print("Salary is" + " "+ salary);

        }

    }
}
