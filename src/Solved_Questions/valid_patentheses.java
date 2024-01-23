package Solved_Questions;

public class valid_patentheses {
    public static void main(String[] args) {
        String s = "(){}[]";
        boolean Valid = parent(s);
        System.out.println(Valid);
    }

    static boolean parent(String s) {
        while (s.contains("()") || s.contains("{}") || s.contains("[]")) {
            s = s.replace("()", "").replace("{}", "").replace("[]", "");
        }
        return s.isEmpty();
    }
}
