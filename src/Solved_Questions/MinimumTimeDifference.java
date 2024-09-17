package Solved_Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinimumTimeDifference {
    public static void main(String[] args) {

    }
    public static int findMinDifference(List<String> timePoints) {
        List<Integer> minutes = new ArrayList<>();
        for (String time : timePoints) {
            minutes.add(convertToMinutes(time));
        }

        Collections.sort(minutes);

        int minDiff = Integer.MAX_VALUE;

        for (int i = 1; i < minutes.size(); i++) {
            minDiff = Math.min(minDiff, minutes.get(i) - minutes.get(i - 1));
        }

        int circularDiff = (1440 - minutes.get(minutes.size() - 1)) + minutes.get(0);
        minDiff = Math.min(minDiff, circularDiff);

        return minDiff;
    }

    private static int convertToMinutes(String time) {
        String[] parts = time.split(":");
        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);
        return hours * 60 + minutes;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        List<String> timePoints = Arrays.asList("23:59", "00:00", "12:30");
        System.out.println(sol.findMinDifference(timePoints));
    }
}
