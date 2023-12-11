package java_questions_solved;

import java.util.LinkedList;

public class ValidLongestParentheses {
    public static void main(String[] args) {
        SolutionLongest result = new SolutionLongest();
        System.out.println(result.longestValidParentheses("(()"));
    }
}

class SolutionLongest {
    public int longestValidParentheses(String s) {
        LinkedList<Integer> stack = new LinkedList<>();
        int result = 0;
        stack.push(-1);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ')' && stack.size() > 1 && s.charAt(stack.peek()) == '(') {
                stack.pop();
                result = Math.max(result, i - stack.peek());
            } else {
                stack.push(i);
            }
        }
        return result;
    }
}
