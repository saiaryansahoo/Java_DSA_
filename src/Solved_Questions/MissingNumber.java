package Solved_Questions;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {3, 0, 1};
        int result=missingNumber(nums);
        System.out.println(result);
    }

    public static int missingNumber(int[] arr) {
        int b = 0;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == b) {
                b++;
            } else return b;
        }
        return b;
    }
}
