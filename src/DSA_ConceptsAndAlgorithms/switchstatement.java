package DSA_ConceptsAndAlgorithms;

import java.util.Scanner;

public class switchstatement {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the name of the fruit:");
        String fruit=in.next();


        switch (fruit) {
            case "Mango" -> System.out.println("King of fruit");
            case "Apple" -> System.out.println("A sweet red fruit");
            case "Orange" -> System.out.println("A Round Fruit");
        }

    }
}
