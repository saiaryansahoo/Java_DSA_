package Solved_Questions;

import java.util.HashSet;
import java.util.Scanner;

public class stringDifference {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String A=sc.nextLine();

        String B=sc.nextLine();

        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < B.length(); i++) {
            set.add(B.charAt(i));
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < A.length(); i++) {
            char ch = A.charAt(i);
            if (!set.contains(ch)) {
                result.append(ch);
            }
        }

        System.out.println("Output: " + result.toString());
    }
}