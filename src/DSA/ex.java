package DSA;

import java.time.LocalTime;
import java.util.Scanner;

public class ex {
    // This method prints a greeting message based on the current time of day.
    public static void main(String[] args) {
        // Get the current time in hours.
        LocalTime now = LocalTime.now();
        int hour = now.getHour();

        // Declare a variable to store the greeting message.
        String greeting;

        // Use a switch statement to determine the appropriate greeting message
        // based on the current hour.
        switch (hour) {
            case 4 ...11:
                greeting = "Good morning!";
                break;
            case 12 ... 16:
                greeting = "Good afternoon!";
                break;
            case 17 ...20:
                greeting = "Good evening!";
                break;
            default:
                greeting = "Good night!";
                break;
        }

        // Print the greeting message.
        System.out.println(greeting);
    }
}
