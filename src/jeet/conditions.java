package jeet;

import java.util.Scanner;

public class conditions {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the First No:");
        float no1=input.nextFloat();
        System.out.print("Enter the Second No:");
        float no2=input.nextFloat();
        float sum=no1+no2;
       if (sum>=10){
           System.out.println("Correct");

        }
        if (sum<10 && sum>2){
            System.out.println("Wrong");
        }
        while(sum==1){
            System.out.println("Check Again");
            break;
//        for( float lol=no1+no1; sum==1 && sum>=20;){
//            System.out.println("Right");
//            break;
//        }
        }
    }}
