package Solved_Questions;

public class LargestOddNumberinString {
    public static void main(String[] args) {
        System.out.println(largestOddNumber("52"));
    }
    public static String largestOddNumber(String num) {
        String result = "";
        for (int i = num.length() - 1; i >= 0; i--) {
            if (num.charAt(i) % 2 != 0) {
                result = num.substring(0, i + 1);
                break;
            }
        }
        return result;
    }
}
