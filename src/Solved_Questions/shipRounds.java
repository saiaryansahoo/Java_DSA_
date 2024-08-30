package Solved_Questions;

import java.util.Scanner;

public class shipRounds {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter number of people: ");
        int people=sc.nextInt();

        System.out.print("Enter the capacity of ship: ");
        int capacity=sc.nextInt();

        int rounds=capacity/people;

        if(capacity%people!=0){
            rounds += 1;
        }

        System.out.println("Number of required rounds: " +rounds);
    }
}
