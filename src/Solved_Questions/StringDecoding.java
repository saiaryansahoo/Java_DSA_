package Solved_Questions;

import java.util.Scanner;

public class StringDecoding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder decodedWord = new StringBuilder();

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                count++;
            } else if (s.charAt(i) == '0' && count > 0) {
                char letter = (char) ('A' + count - 1);
                decodedWord.append(letter);
                count = 0;
            }
        }

        if (count > 0) {
            char letter = (char) ('A' + count - 1);
            decodedWord.append(letter);
        }

        System.out.println("Decoded word: " + decodedWord.toString());
    }
}
