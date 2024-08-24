package Solved_Questions;

public class ReplaceStringChar {
    public static String helper(String str, char ch1, char ch2) {
        if (str == null) return str;

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch1) {
                result += ch2;
            } else if (str.charAt(i) == ch2) {
                result += ch1;
            } else {
                result += str.charAt(i);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String s = "apples";
        char ch1 = 'a';
        char ch2 = 'p';

        String modifiedString = helper(s, ch1, ch2);
        System.out.println(modifiedString);  // Output will be "aaples"
    }
}
