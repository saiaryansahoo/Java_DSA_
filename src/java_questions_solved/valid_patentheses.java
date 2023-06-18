package java_questions_solved;

public class valid_patentheses {
    public static void main(String[] args) {
        String s = "()";
        boolean isValid = parent(s);
        System.out.println(isValid);
    }

    static boolean parent(String s) {
        while (s.contains("()") || s.contains("{}") || s.contains("[]")) {
            s = s.replace("()", "").replace("{}", "").replace("[]", "");
        }
        return s.isEmpty();
    }
}
